package org.redlich.publications.db.publications.publications.generated;

import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.LongForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;
import java.util.Optional;
import org.redlich.publications.db.publications.authors.Authors;
import org.redlich.publications.db.publications.publications.Publications;
import org.redlich.publications.db.publications.publishers.Publishers;
import org.redlich.publications.db.publications.types.Types;

/**
 * The generated base for the {@link
 * org.redlich.publications.db.publications.publications.Publications}-interface
 * representing entities of the {@code publications}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPublications {
    
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getId()} method.
     */
    final LongField<Publications, Long> ID = LongField.create(
        Identifier.ID,
        Publications::getId,
        Publications::setId,
        TypeMapper.primitive(), 
        true
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getVersion()} method.
     */
    final LongField<Publications, Long> VERSION = LongField.create(
        Identifier.VERSION,
        Publications::getVersion,
        Publications::setVersion,
        TypeMapper.primitive(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getTypeId()} method.
     */
    final LongForeignKeyField<Publications, Long, Types> TYPE_ID = LongForeignKeyField.create(
        Identifier.TYPE_ID,
        Publications::getTypeId,
        Publications::setTypeId,
        Types.ID,
        TypeMapper.primitive(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getTitle()} method.
     */
    final StringField<Publications, String> TITLE = StringField.create(
        Identifier.TITLE,
        Publications::getTitle,
        Publications::setTitle,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getAuthorId()} method.
     */
    final LongForeignKeyField<Publications, Long, Authors> AUTHOR_ID = LongForeignKeyField.create(
        Identifier.AUTHOR_ID,
        Publications::getAuthorId,
        Publications::setAuthorId,
        Authors.ID,
        TypeMapper.primitive(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getPublisherId()} method.
     */
    final LongForeignKeyField<Publications, Long, Publishers> PUBLISHER_ID = LongForeignKeyField.create(
        Identifier.PUBLISHER_ID,
        Publications::getPublisherId,
        Publications::setPublisherId,
        Publishers.ID,
        TypeMapper.primitive(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getDueDate()} method.
     */
    final ComparableField<Publications, Timestamp, Timestamp> DUE_DATE = ComparableField.create(
        Identifier.DUE_DATE,
        o -> OptionalUtil.unwrap(o.getDueDate()),
        Publications::setDueDate,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getSubmitDate()} method.
     */
    final ComparableField<Publications, Timestamp, Timestamp> SUBMIT_DATE = ComparableField.create(
        Identifier.SUBMIT_DATE,
        o -> OptionalUtil.unwrap(o.getSubmitDate()),
        Publications::setSubmitDate,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getPublishDate()} method.
     */
    final ComparableField<Publications, Timestamp, Timestamp> PUBLISH_DATE = ComparableField.create(
        Identifier.PUBLISH_DATE,
        o -> OptionalUtil.unwrap(o.getPublishDate()),
        Publications::setPublishDate,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Publications} field that can be
     * obtained using the {@link Publications#getUrl()} method.
     */
    final StringField<Publications, String> URL = StringField.create(
        Identifier.URL,
        o -> OptionalUtil.unwrap(o.getUrl()),
        Publications::setUrl,
        TypeMapper.identity(), 
        false
    );
    
    /**
     * Returns the id of this Publications. The id field corresponds to the
     * database column db.publications.publications.id.
     * 
     * @return the id of this Publications
     */
    long getId();
    
    /**
     * Returns the version of this Publications. The version field corresponds
     * to the database column db.publications.publications.version.
     * 
     * @return the version of this Publications
     */
    long getVersion();
    
    /**
     * Returns the typeId of this Publications. The typeId field corresponds to
     * the database column db.publications.publications.type_id.
     * 
     * @return the typeId of this Publications
     */
    long getTypeId();
    
    /**
     * Returns the title of this Publications. The title field corresponds to
     * the database column db.publications.publications.title.
     * 
     * @return the title of this Publications
     */
    String getTitle();
    
    /**
     * Returns the authorId of this Publications. The authorId field corresponds
     * to the database column db.publications.publications.author_id.
     * 
     * @return the authorId of this Publications
     */
    long getAuthorId();
    
    /**
     * Returns the publisherId of this Publications. The publisherId field
     * corresponds to the database column
     * db.publications.publications.publisher_id.
     * 
     * @return the publisherId of this Publications
     */
    long getPublisherId();
    
    /**
     * Returns the dueDate of this Publications. The dueDate field corresponds
     * to the database column db.publications.publications.due_date.
     * 
     * @return the dueDate of this Publications
     */
    Optional<Timestamp> getDueDate();
    
    /**
     * Returns the submitDate of this Publications. The submitDate field
     * corresponds to the database column
     * db.publications.publications.submit_date.
     * 
     * @return the submitDate of this Publications
     */
    Optional<Timestamp> getSubmitDate();
    
    /**
     * Returns the publishDate of this Publications. The publishDate field
     * corresponds to the database column
     * db.publications.publications.publish_date.
     * 
     * @return the publishDate of this Publications
     */
    Optional<Timestamp> getPublishDate();
    
    /**
     * Returns the url of this Publications. The url field corresponds to the
     * database column db.publications.publications.url.
     * 
     * @return the url of this Publications
     */
    Optional<String> getUrl();
    
    /**
     * Sets the id of this Publications. The id field corresponds to the
     * database column db.publications.publications.id.
     * 
     * @param id to set of this Publications
     * @return   this Publications instance
     */
    Publications setId(long id);
    
    /**
     * Sets the version of this Publications. The version field corresponds to
     * the database column db.publications.publications.version.
     * 
     * @param version to set of this Publications
     * @return        this Publications instance
     */
    Publications setVersion(long version);
    
    /**
     * Sets the typeId of this Publications. The typeId field corresponds to the
     * database column db.publications.publications.type_id.
     * 
     * @param typeId to set of this Publications
     * @return       this Publications instance
     */
    Publications setTypeId(long typeId);
    
    /**
     * Sets the title of this Publications. The title field corresponds to the
     * database column db.publications.publications.title.
     * 
     * @param title to set of this Publications
     * @return      this Publications instance
     */
    Publications setTitle(String title);
    
    /**
     * Sets the authorId of this Publications. The authorId field corresponds to
     * the database column db.publications.publications.author_id.
     * 
     * @param authorId to set of this Publications
     * @return         this Publications instance
     */
    Publications setAuthorId(long authorId);
    
    /**
     * Sets the publisherId of this Publications. The publisherId field
     * corresponds to the database column
     * db.publications.publications.publisher_id.
     * 
     * @param publisherId to set of this Publications
     * @return            this Publications instance
     */
    Publications setPublisherId(long publisherId);
    
    /**
     * Sets the dueDate of this Publications. The dueDate field corresponds to
     * the database column db.publications.publications.due_date.
     * 
     * @param dueDate to set of this Publications
     * @return        this Publications instance
     */
    Publications setDueDate(Timestamp dueDate);
    
    /**
     * Sets the submitDate of this Publications. The submitDate field
     * corresponds to the database column
     * db.publications.publications.submit_date.
     * 
     * @param submitDate to set of this Publications
     * @return           this Publications instance
     */
    Publications setSubmitDate(Timestamp submitDate);
    
    /**
     * Sets the publishDate of this Publications. The publishDate field
     * corresponds to the database column
     * db.publications.publications.publish_date.
     * 
     * @param publishDate to set of this Publications
     * @return            this Publications instance
     */
    Publications setPublishDate(Timestamp publishDate);
    
    /**
     * Sets the url of this Publications. The url field corresponds to the
     * database column db.publications.publications.url.
     * 
     * @param url to set of this Publications
     * @return    this Publications instance
     */
    Publications setUrl(String url);
    
    /**
     * Queries the specified manager for the referenced Types. If no such Types
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Types findTypeId(Manager<Types> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Authors. If no such
     * Authors exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Authors findAuthorId(Manager<Authors> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Publishers. If no such
     * Publishers exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Publishers findPublisherId(Manager<Publishers> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Publications> {
        
        ID           ("id"),
        VERSION      ("version"),
        TYPE_ID      ("type_id"),
        TITLE        ("title"),
        AUTHOR_ID    ("author_id"),
        PUBLISHER_ID ("publisher_id"),
        DUE_DATE     ("due_date"),
        SUBMIT_DATE  ("submit_date"),
        PUBLISH_DATE ("publish_date"),
        URL          ("url");
        
        private final String columnName;
        private final TableIdentifier<Publications> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "db";
        }
        
        @Override
        public String getSchemaName() {
            return "publications";
        }
        
        @Override
        public String getTableName() {
            return "publications";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Publications> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}