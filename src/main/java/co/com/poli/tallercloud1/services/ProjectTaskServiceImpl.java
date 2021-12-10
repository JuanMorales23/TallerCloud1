package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.ProjectTask;
import co.com.poli.tallercloud1.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {
    @Autowired
    ProjectTaskRepository projectTaskRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProjectTask> findAll() {
        return projectTaskRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(ProjectTask projectTask) {
        projectTaskRepository.save(projectTask);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(ProjectTask projectTask) {
        projectTaskRepository.delete(projectTask);
    }

    @Override
    @Transactional(readOnly = true)
    public ProjectTask findById(ProjectTask projectTask) {
        return projectTaskRepository.findById(projectTask.getId()).orElse(null);
    }
}
