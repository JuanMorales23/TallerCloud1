package co.com.poli.taller.controller;

import co.com.poli.taller.services.ProjectTaskService;
import co.com.poli.taller.entities.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectTask")
public class ProjectTaskController {

    @Autowired
    ProjectTaskService projectTaskService;

    @GetMapping
    public List<ProjectTask> findAll(){
        return projectTaskService.findAll();
    }

    @PostMapping()
    public ProjectTask create (@RequestBody ProjectTask projectTask){
        System.out.println("xd");
        return projectTaskService.create(projectTask);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Long id){
        projectTaskService.delete(id);
    }

    @GetMapping("/{id}")
    public ProjectTask findById(@PathVariable("id") Long id){
        return projectTaskService.findById(id);
    }
}
