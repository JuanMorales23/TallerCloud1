package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.services.BacklogService;
import co.com.poli.tallercloud1.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/project")
public class ProjectController {

     ProjectService projectService;

    @GetMapping
    public List<Project> findAll(){
        return projectService.findAll();
    }

    @PostMapping
    public Project create (@RequestBody Project project){
        return projectService.create(project);
    }

}
