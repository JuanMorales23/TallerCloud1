package co.com.poli.taller.services;

import co.com.poli.taller.entities.ProjectTask;
import co.com.poli.taller.repository.ProjectTaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTaskServiceImpTest {
/*
    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @Test
    void createProjectTask(){
        ProjectTask projectTask = ProjectTask.builder()
                .name("Nombre")
                .summary("Summary")
                .acceptanceCriteria("Acceptance")
                .status("status")
                .hours(3.2)
                .build();
        projectTaskRepository.save(projectTask);
        List<ProjectTask> projectTaskList = projectTaskRepository.findAll();
        Assertions.assertEquals("Nombre",projectTask.getName());
    }


 */
}