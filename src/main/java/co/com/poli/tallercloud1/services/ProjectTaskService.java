package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.ProjectTask;

import java.util.List;

public interface ProjectTaskService {
    List<ProjectTask> findAll();
    void create(ProjectTask projectTask);
    void delete(ProjectTask projectTask);
    ProjectTask findById(ProjectTask projectTask);
}
