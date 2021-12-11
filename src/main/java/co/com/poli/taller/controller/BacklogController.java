package co.com.poli.taller.controller;

import co.com.poli.taller.entities.Backlog;
import co.com.poli.taller.services.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backlog")
public class BacklogController {

    @Autowired
    BacklogService backlogService;

    @GetMapping
    public List<Backlog> findAll(){
        return backlogService.findAll();
    }

    @PostMapping
    public Backlog create (@RequestBody Backlog backlog){
        return backlogService.create(backlog);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") Long id){
        backlogService.delete(id);
    }

    @GetMapping("/{id}")
    public Backlog findById(@PathVariable("id") Long id){
        return backlogService.findById(id);
    }
}
