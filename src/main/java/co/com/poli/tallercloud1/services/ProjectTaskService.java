package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOProjectTask;
import co.com.poli.tallercloud1.entity.ProjectTask;

import java.util.List;

public interface ProjectTaskService {
    List<ProjectTask> listAll();
    DTOProjectTask create(DTOProjectTask dtoProjectTask);
    void delete(DTOProjectTask dtoProjectTask);
    ProjectTask findById(Long id);
}
