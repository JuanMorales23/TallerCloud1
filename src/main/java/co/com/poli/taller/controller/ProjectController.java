package co.com.poli.taller.controller;

import co.com.poli.taller.entities.Project;
import co.com.poli.taller.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Project> findAll(){
        return projectService.findAll();
    }

    @PostMapping()
    public Project create (@RequestBody Project project){
        return projectService.create(project);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Long id){
        projectService.delete(id);
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable("id") Long id){
        return projectService.findById(id);
    }
}
