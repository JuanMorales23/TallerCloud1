package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.dto.DTOProjectTask;
import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.entity.ProjectTask;
import co.com.poli.tallercloud1.services.ProjectTaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class ProjectTaskController {

    ProjectTaskService projectTaskService;

    @GetMapping
    public List<ProjectTask> findAll(){
        return projectTaskService.listAll();
    }

    @PostMapping(value = "")
    public DTOProjectTask create (@RequestBody DTOProjectTask dtoProjectTask){
        return projectTaskService.create(dtoProjectTask);
    }

    @DeleteMapping
    public void delete (@RequestBody DTOProjectTask dtoProjectTask){
        projectTaskService.delete(dtoProjectTask);
    }

    @GetMapping
    public ProjectTask findById (@RequestBody Long id){
        return projectTaskService.findById(id);
    }
}
