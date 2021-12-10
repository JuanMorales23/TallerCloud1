package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOProjectTask;
import co.com.poli.tallercloud1.entity.ProjectTask;
import co.com.poli.tallercloud1.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {
    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProjectTask> listAll() {
        return projectTaskRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DTOProjectTask create(DTOProjectTask dtoProjectTask) {
        return projectTaskRepository.save(dtoProjectTask);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(DTOProjectTask dtoProjectTask) {
        projectTaskRepository.delete(dtoProjectTask);
    }

    @Override
    @Transactional(readOnly = true)
    public ProjectTask findById(Long id) {
        return projectTaskRepository.findById(id).orElse(null);
    }
}
