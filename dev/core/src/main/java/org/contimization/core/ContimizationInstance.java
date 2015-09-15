package org.contimization.core;

import org.contimization.core.configuration.DefaultBootstrapConfigurationModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ContimizationInstance {
	
	private Injector injector;

	public Injector getInjector()
	{
		return injector;
	}
	
	public ContimizationInstance() {
		injector = Guice.createInjector(new DefaultBootstrapConfigurationModule());
	}

	public void setInjector(Injector injector) {
		this.injector = injector;
	}
	
	

}
