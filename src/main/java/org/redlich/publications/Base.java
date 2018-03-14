package org.redlich.publications;

import org.redlich.publications.db.publications.authors.AuthorsManager;
import org.redlich.publications.db.publications.publications.PublicationsManager;
import org.redlich.publications.db.publications.publishers.PublishersManager;
import org.redlich.publications.db.publications.states.StatesManager;
import org.redlich.publications.db.publications.types.TypesManager;

import static com.speedment.runtime.core.ApplicationBuilder.LogType.PERSIST;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.REMOVE;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.STREAM;
import static com.speedment.runtime.core.ApplicationBuilder.LogType.UPDATE;

public class Base {
    protected final PublicationsApplication app;
    protected final AuthorsManager authorsManager;
    protected final PublicationsManager publicationsManager;
    protected final PublishersManager publishersManager;
    protected final StatesManager statesManager;
    protected final TypesManager typesManager;

    public Base() {
        app = new PublicationsApplicationBuilder()
                .withPassword("")
                .withLogging(STREAM)
                .withLogging(PERSIST)
                .withLogging(UPDATE)
                .withLogging(REMOVE)
                .build();
        authorsManager = app.getOrThrow(AuthorsManager.class);
        publicationsManager = app.getOrThrow(PublicationsManager.class);
        publishersManager = app.getOrThrow(PublishersManager.class);
        statesManager = app.getOrThrow(StatesManager.class);
        typesManager = app.getOrThrow(TypesManager.class);
        }
    }
