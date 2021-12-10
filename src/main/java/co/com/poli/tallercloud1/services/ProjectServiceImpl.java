package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.entity.ProjectTask;
import co.com.poli.tallercloud1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    ProjectRepository projectRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Project> listAll() {
        return projectRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(Project project) {
        projectRepository.save(project);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Project project) {
        projectRepository.delete(project);
    }

    @Override
    @Transactional(readOnly = true)
    public Project findById(Project project) {
        return projectRepository.findById(project.getId()).orElse(null);
    }
}
