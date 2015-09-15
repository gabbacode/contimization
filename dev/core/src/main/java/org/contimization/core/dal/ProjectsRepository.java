package org.contimization.core.dal;

import java.util.Date;

import org.contimization.core.dal.entities.ProjectStatus;

public interface ProjectsRepository {

	ProjectStatus[] GetAllProjectStatuses(Date date);

}
