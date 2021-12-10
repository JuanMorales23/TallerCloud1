package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.services.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/backlog")
public class BacklogController {

    @Autowired
    BacklogService backlogService;


}
