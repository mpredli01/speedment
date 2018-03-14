package org.redlich.publications.db.publications.authors.generated;

import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.redlich.publications.db.publications.authors.Authors;
import org.redlich.publications.db.publications.authors.AuthorsImpl;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * org.redlich.publications.db.publications.authors.Authors} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAuthorsSqlAdapter {
    
    private final TableIdentifier<Authors> tableIdentifier;
    
    protected GeneratedAuthorsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db", "publications", "authors");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent, @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Authors apply(ResultSet resultSet) throws SpeedmentException {
        final Authors entity = createEntity();
        try {
            entity.setId(         resultSet.getLong(1)    );
            entity.setVersion(    resultSet.getLong(2)    );
            entity.setPrefix(     resultSet.getString(3)  );
            entity.setLastName(   resultSet.getString(4)  );
            entity.setFirstName(  resultSet.getString(5)  );
            entity.setMiddleInit( resultSet.getString(6)  );
            entity.setSuffix(     resultSet.getString(7)  );
            entity.setAddress(    resultSet.getString(8)  );
            entity.setCity(       resultSet.getString(9)  );
            entity.setStateId(    resultSet.getLong(10)   );
            entity.setZipCode(    resultSet.getString(11) );
            entity.setHomePhone(  resultSet.getString(12) );
            entity.setCellPhone(  resultSet.getString(13) );
            entity.setWorkPhone(  resultSet.getString(14) );
            entity.setHomeEmail(  resultSet.getString(15) );
            entity.setWorkEmail(  resultSet.getString(16) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected AuthorsImpl createEntity() {
        return new AuthorsImpl();
    }
}