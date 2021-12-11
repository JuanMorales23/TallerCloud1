package co.com.poli.taller.services;

import co.com.poli.taller.repository.ProjectTaskRepository;
import co.com.poli.taller.entities.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectTaskServiceImp implements ProjectTaskService{

    @Autowired
    ProjectTaskRepository projectTaskRepository;

    @Override
    public ProjectTask create(ProjectTask projectTask) {
        return projectTaskRepository.save(projectTask);
    }

    @Override
    public List<ProjectTask> findAll() {
        return projectTaskRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        projectTaskRepository.deleteById(id);
    }

    @Override
    public ProjectTask findById(Long id) {
        return projectTaskRepository.findById(id).orElse(null);
    }

    @Override
    public Double getProjectHours(Long projectId){
        Double hours=0.0;
        List<ProjectTask> projectTask = projectTaskRepository.findAll();
        for (int i=0; i<projectTask.size(); i++){
                hours+=projectTask.get(i).getHours();
        }
        return hours;
    }
}
