package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.entity.ProjectTask;

import java.util.List;

public interface ProjectService {
    List<Project> listAll();
    void create(Project project);
    void delete(Project project);
    Project findById(Project project);
}
