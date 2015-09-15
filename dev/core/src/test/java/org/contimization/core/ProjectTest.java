package org.contimization.core;

import org.contimization.core.ContimizationInstance;
import org.contimization.core.dal.*;
import org.contimization.core.dal.entities.*;
import org.contimization.core.services.TaskManageService;
import org.junit.Test;

import com.google.inject.Guice;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class ProjectTest {
	
	@Test
	public void taskManageServiceCreationTest() {
		ContimizationInstance instance = new ContimizationInstance(); 

		ProjectsRepository pr = mock(ProjectRepositoryImplementation.class);
		when(pr.GetAllProjectStatuses(any())).thenReturn(new ProjectStatus[] {});
				
		
		instance.setInjector(
				Guice.createInjector(new TestConfigurationModule(pr)));
		
		TaskManageService taskManager = instance.getInjector().getInstance(TaskManageService.class);
		taskManager.GetRunnedTasks();
		
		ProjectStatus[] statuses = taskManager.GetProjectStatuses();
		assertNotNull(statuses);
	}
}
