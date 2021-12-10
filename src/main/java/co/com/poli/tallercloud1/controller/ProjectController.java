package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.dto.DTOProject;
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
        return projectService.listAll();
    }

    @PostMapping("/create")
    public void create (@RequestBody String nada){
        System.out.println("xd");
        //return projectService.create(dtoProject);
    }

    @DeleteMapping
    public void delete (@RequestBody DTOProject dtoProject){
        projectService.delete(dtoProject);
    }

    @GetMapping
    public Project findById(@RequestBody Long id){
        return projectService.findById(id);
    }

}
