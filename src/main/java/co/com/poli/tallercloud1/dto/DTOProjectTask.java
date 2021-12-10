package co.com.poli.tallercloud1.dto;

import co.com.poli.tallercloud1.entity.Backlog;
import co.com.poli.tallercloud1.entity.ProjectTask;

public class DTOProjectTask extends ProjectTask {

    public ProjectTask convertInProjectTask(){
        ProjectTask projectTask = new ProjectTask();
        projectTask.setId(id);
        projectTask.setName(name);
        projectTask.setSummary(summary);
        projectTask.setAcceptanceCriteria(acceptanceCriteria);
        projectTask.setStatus(status);
        projectTask.setHours(hours);
        projectTask.setStartDate(startDate);
        projectTask.setEndDate(endDate);
        projectTask.setProjectIdentifier(projectIdentifier);
        projectTask.setBacklog(backlog);
        return projectTask;
    }

    public void convertInDTO(ProjectTask projectTask){
        id = projectTask.getId();
        name = projectTask.getName();
        summary = projectTask.getSummary();
        acceptanceCriteria = projectTask.getAcceptanceCriteria();
        status = projectTask.getStatus();
        hours = projectTask.getHours();
        startDate = projectTask.getStartDate();
        endDate = projectTask.getEndDate();
        projectIdentifier = projectTask.getProjectIdentifier();
        backlog = projectTask.getBacklog();
    }
}
