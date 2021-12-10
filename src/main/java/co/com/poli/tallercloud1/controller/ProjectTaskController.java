package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.services.ProjectService;
import co.com.poli.tallercloud1.services.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class ProjectTaskController {


    ProjectTaskService projectTaskService;

    @GetMapping
    public List<Project> findAll(){
        return projectTaskService.findAll();
    }

    @PostMapping
    public Project create (@RequestBody Project project){
        return projectTaskService.create(project);
    }

}
