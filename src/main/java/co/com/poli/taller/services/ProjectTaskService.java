package co.com.poli.taller.services;

import co.com.poli.taller.entities.ProjectTask;

import java.util.List;

public interface ProjectTaskService {
    ProjectTask create(ProjectTask projectTask);
    List<ProjectTask> findAll( );
    void delete(Long id);
    ProjectTask findById(Long id);
    Double getProjectHours(Long id);
}
