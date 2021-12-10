package co.com.poli.tallercloud1.controller;

import co.com.poli.tallercloud1.services.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class ProjectTaskController {

    @Autowired
    ProjectTaskService projectTaskService;

}
