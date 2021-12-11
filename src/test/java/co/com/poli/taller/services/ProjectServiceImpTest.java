package co.com.poli.taller.services;

import co.com.poli.taller.entities.Project;
import co.com.poli.taller.repository.ProjectRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectServiceImpTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Test
    void createProject(){
        Project project = Project.builder()
                .projectName("Proyecto")
                .projectIdentifier("Identificador")
                .description("Una Descripción")
                .build();
        projectRepository.save(project);
        List<Project> projectList = projectRepository.findAll();
        assertTrue(projectList.isEmpty());
    }
}