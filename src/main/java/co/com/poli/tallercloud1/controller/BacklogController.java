package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.dto.DTOBacklog;
import co.com.poli.tallercloud1.entity.Backlog;
import co.com.poli.tallercloud1.services.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/backlog")
public class BacklogController {
    @Autowired
    BacklogService backlogService;

    @GetMapping("/hola")
    public String hola(){
        return "Hola";
    }

    @GetMapping
    public List<Backlog> findAll(){
        return backlogService.listAll();
    }

    @PostMapping
    public DTOBacklog create (@RequestBody DTOBacklog dtoBacklog){
        return backlogService.create(dtoBacklog);
    }

    @DeleteMapping
    public void delete(@RequestBody DTOBacklog dtoBacklog){
        backlogService.delete(dtoBacklog);
    }

    @GetMapping
    public Backlog findById(@RequestBody Long id){
        return backlogService.findById(id);
    }
}
