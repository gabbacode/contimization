package org.contimization.core.services;

import java.util.Date;

import org.contimization.core.dal.ProjectsRepository;
import org.contimization.core.dal.entities.*;

import com.google.inject.Inject;

public class TaskManageServiceImplementation implements TaskManageService {

	private ProjectsRepository projectsRepository;

	@Inject
	public TaskManageServiceImplementation(ProjectsRepository projectsRepository)
	{
		this.projectsRepository = projectsRepository;
	}
	
	@Override
	public Task[] GetRunnedTasks() {
		return null;
	}

	@Override
	public ProjectStatus[] GetProjectStatuses() {
		return projectsRepository.GetAllProjectStatuses(new Date());
	}

}
