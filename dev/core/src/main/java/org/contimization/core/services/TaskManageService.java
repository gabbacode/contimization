package org.contimization.core.services;

import org.contimization.core.dal.entities.*;

public interface TaskManageService {

	Task[] GetRunnedTasks();

	ProjectStatus[] GetProjectStatuses();

}
