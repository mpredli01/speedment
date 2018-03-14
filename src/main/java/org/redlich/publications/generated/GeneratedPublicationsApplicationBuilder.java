package org.redlich.publications.generated;

import com.speedment.common.injector.Injector;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.internal.AbstractApplicationBuilder;
import org.redlich.publications.PublicationsApplication;
import org.redlich.publications.PublicationsApplicationBuilder;
import org.redlich.publications.PublicationsApplicationImpl;
import org.redlich.publications.db.publications.authors.AuthorsManagerImpl;
import org.redlich.publications.db.publications.authors.AuthorsSqlAdapter;
import org.redlich.publications.db.publications.publications.PublicationsManagerImpl;
import org.redlich.publications.db.publications.publications.PublicationsSqlAdapter;
import org.redlich.publications.db.publications.publishers.PublishersManagerImpl;
import org.redlich.publications.db.publications.publishers.PublishersSqlAdapter;
import org.redlich.publications.db.publications.states.StatesManagerImpl;
import org.redlich.publications.db.publications.states.StatesSqlAdapter;
import org.redlich.publications.db.publications.types.TypesManagerImpl;
import org.redlich.publications.db.publications.types.TypesSqlAdapter;

/**
 * A generated base {@link
 * com.speedment.runtime.core.internal.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named publications.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPublicationsApplicationBuilder extends AbstractApplicationBuilder<PublicationsApplication, PublicationsApplicationBuilder> {
    
    protected GeneratedPublicationsApplicationBuilder() {
        super(PublicationsApplicationImpl.class, GeneratedPublicationsMetadata.class);
        withManager(AuthorsManagerImpl.class);
        withManager(PublicationsManagerImpl.class);
        withManager(PublishersManagerImpl.class);
        withManager(StatesManagerImpl.class);
        withManager(TypesManagerImpl.class);
        withComponent(AuthorsSqlAdapter.class);
        withComponent(PublicationsSqlAdapter.class);
        withComponent(PublishersSqlAdapter.class);
        withComponent(StatesSqlAdapter.class);
        withComponent(TypesSqlAdapter.class);
    }
    
    @Override
    public PublicationsApplication build(Injector injector) {
        return injector.getOrThrow(PublicationsApplication.class);
    }
}