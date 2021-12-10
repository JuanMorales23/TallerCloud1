package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.entity.Backlog;
import co.com.poli.tallercloud1.services.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/backlog")
public class BacklogController {

    BacklogService backlogService;

    @GetMapping
    public List<Backlog> findAll(){
        return backlogService.findAll();
    }

    @PostMapping
    public Backlog create (@RequestBody Backlog backlog){
        return backlogService.create(backlog);
    }

}
