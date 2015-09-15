package org.contimization.core;

import org.contimization.core.configuration.DefaultBootstrapConfigurationModule;
import org.contimization.core.dal.ProjectsRepository;


public class TestConfigurationModule extends DefaultBootstrapConfigurationModule {

	private ProjectsRepository projectRepository;

	public TestConfigurationModule(ProjectsRepository pr) {
		this.projectRepository = pr;
	}

	@Override
	protected void configureExtensions() {
		bind(ProjectsRepository.class).toInstance(this.projectRepository);		
	}
	
}
