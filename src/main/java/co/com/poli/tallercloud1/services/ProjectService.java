package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOProject;
import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.entity.ProjectTask;

import java.util.List;

public interface ProjectService {
    List<Project> listAll();
    DTOProject create(DTOProject dtoProject);
    void delete(DTOProject dtoProject);
    Project findById(Long id);
}
