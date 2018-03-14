package org.redlich.publications.db.publications.states.generated;

import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import org.redlich.publications.db.publications.states.States;

/**
 * The generated base interface for the manager of every {@link
 * org.redlich.publications.db.publications.states.States} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStatesManager extends Manager<States> {
    
    @Override
    default Class<States> getEntityClass() {
        return States.class;
    }
}