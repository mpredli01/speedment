package org.redlich.publications;

import org.redlich.publications.db.publications.authors.Authors;
import org.redlich.publications.db.publications.publications.Publications;
import org.redlich.publications.db.publications.publications.PublicationsImpl;
import org.redlich.publications.db.publications.publishers.Publishers;
import org.redlich.publications.db.publications.states.States;
import org.redlich.publications.db.publications.types.Types;

import java.util.Calendar;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import java.sql.Date;

import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.component.EntityManager;
import com.speedment.runtime.core.exception.SpeedmentException;
import com.speedment.runtime.field.trait.HasComparableOperators;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.PERSIST;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.REMOVE;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.STREAM;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.UPDATE;

/**
 *
 * @author Your name
 */
public class Main extends Base {
    public static void main(String... param) {
        Main main = new Main();

        // run("Builder",main::builderDemo);
        run("Simple",main::simpleDemo);
        run("Filter",main::filterDemo);
        run("Count",main::countDemo);
        run("KeyValue",main::keyValueDemo);
        run("Join",main::joinDemo);
        run("Multi-Join",main::multiJoinDemo);
        }

    private void simpleDemo() {
        publicationsManager.stream()
                .forEach(System.out::println);
        }

    private void filterDemo() {
        publicationsManager.stream()
                .filter(Publications.TITLE.startsWith("Pivotal"))
                .forEach(System.out::println);
        }

    private void countDemo() {
        long publications = publicationsManager.stream().count();
        System.out.println("\nThere are " + publications + " publications");

        long count = publicationsManager.stream()
                .filter(Publications.AUTHOR_ID.equal(1L))
                .count();
        System.out.println("\nThere are " + count + " publications with authorId = 1");
        }

    private void keyValueDemo() {
        // key-value searches are optimised in the background!
        Optional<Authors> redlich = authorsManager.stream()
                .filter(Authors.LAST_NAME.equal("Redlich"))
                .findAny();
        System.out.println("\n" + redlich.toString());
        }

    private void joinDemo() {
        // There is always an STATE_ID. So finderBy() returns a Function<FK_ENTITY,ENTITY> 1:1
        List<States> statesList01 = authorsManager.stream()
                .map(statesManager.finderBy(org.redlich.publications.db.publications.authors.Authors.STATE_ID)) /// No type control so we could as well use Authors.STATE_ID which is nullable
                .collect(toList());
        System.out.println(statesList01.toString());

        List<Authors> authorsList01 = statesManager.stream()
                .flatMap(authorsManager.finderBackwardsBy(org.redlich.publications.db.publications.authors.Authors.STATE_ID)) // Stream<Authors> Backfinders are always Stream 1:N
                .collect(toList());
        System.out.println(authorsList01.toString());

        // There might be zero or one PUBLISHER_ID. So statesManager.finderByNullable(Authors.PUBLISHER_ID) returns a Stream with zero or one element
        List<Publishers> publishersList = publicationsManager.stream()
                .flatMap(publishersManager.finderByNullable(org.redlich.publications.db.publications.publications.Publications.PUBLISHER_ID)) // Stream<Authors> not Optional<Authors> to enable flatMap
                .collect(toList());
        System.out.println(publishersList.toString());

        List<Authors> authorsList02 = statesManager.stream()
                .flatMap(authorsManager.finderBackwardsBy(org.redlich.publications.db.publications.authors.Authors.STATE_ID)) // Stream<Authors> Backfinders are always Stream 1:N
                .collect(toList());
        System.out.println(authorsList02.toString());

        List<States> statesList02 = authorsManager.stream()
                .map(statesManager.finderBy(org.redlich.publications.db.publications.authors.Authors.STATE_ID)) // Stream<Authors> not Optional<Authors> to enable flatMap
                .collect(toList());
        System.out.println(statesList02.toString());

        Map<States,List<Authors>> join = authorsManager.stream()
                .collect(
                        groupingBy(statesManager.finderBy(org.redlich.publications.db.publications.authors.Authors.STATE_ID)) // applies the finderBy(Authors.STATE_ID) classifier
                );
        System.out.println("\njoin:" + join.toString() + "\n");
        }

    private void multiJoinDemo() {
        Map<States,Map<Authors,List<Publications>>> multiJoin = publicationsManager.stream()
                .collect(
                        groupingBy(
                                s -> statesManager.findBy(Authors.STATE_ID,authorsManager.findBy(Publications.AUTHOR_ID,s)),  // two-step finder
                                groupingBy(
                                        authorsManager.finderBy(Publications.AUTHOR_ID), // one-step finder
                                        toList()
                                )
                        )
                );
        System.out.println("\nmulti-join: " + multiJoin.toString() + "\n");

        /*
         * The example above is for a table named "sale" that has a FK (via the column AUTHOR) to another table "customer" that, in turn, has a FK (via the column STATE) to the table "country".
         * I think you can easily apply the example above to your book/author example.
         * The problem is that the SQL queries will be less efficient than expected even though it will work.
         */

        /*
         * SELECT title,publish_date,authors.last_name,types.type,publishers.publisher
         * FROM publications
         * INNER JOIN authors ON authors.id = publications.author_id
         * INNER JOIN types ON types.id = publications.type_id
         * INNER JOIN publishers ON publishers.id = publications.publisher_id;
         */
        }

    private static void run(String name,Runnable method) {
        System.out.println();
        System.out.println("*** " + name + " Demo ***");
        method.run();
        }
    }