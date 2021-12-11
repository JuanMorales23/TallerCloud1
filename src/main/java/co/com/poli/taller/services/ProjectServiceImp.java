package co.com.poli.taller.services;

import co.com.poli.taller.repository.ProjectRepository;
import co.com.poli.taller.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService{

    @Autowired
    protected ProjectRepository projectRepository;

    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
