package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.services.BacklogService;
import co.com.poli.tallercloud1.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/project")
public class ProjectController {


    @Autowired
    ProjectService projectService;
}
