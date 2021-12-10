package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskServiceImpl implements ProjectService{

    @Autowired
    ProjectTaskRepository projectTaskRepository;
}
