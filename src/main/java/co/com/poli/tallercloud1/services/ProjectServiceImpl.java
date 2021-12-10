package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOProject;
import co.com.poli.tallercloud1.entity.Project;
import co.com.poli.tallercloud1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Project> listAll() {
        return projectRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DTOProject create(DTOProject dtoProject) {

        return projectRepository.save(dtoProject);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(DTOProject dtoProject) {
        projectRepository.delete(dtoProject);
    }

    @Override
    @Transactional(readOnly = true)
    public Project findById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
