package org.contimization.core.configuration;

import org.contimization.core.dal.ProjectRepositoryImplementation;
import org.contimization.core.dal.ProjectsRepository;
import org.contimization.core.services.*;
import com.google.inject.AbstractModule;

public class DefaultBootstrapConfigurationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(TaskManageService.class).to(TaskManageServiceImplementation.class);
	
		configureExtensions();		
	}

	protected void configureExtensions()
	{		
		bind(ProjectsRepository.class).to(ProjectRepositoryImplementation.class);
	}
}
