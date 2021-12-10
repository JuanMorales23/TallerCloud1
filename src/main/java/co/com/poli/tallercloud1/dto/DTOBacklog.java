package co.com.poli.tallercloud1.dto;

import co.com.poli.tallercloud1.entity.Backlog;
import org.springframework.stereotype.Repository;

@Repository
public class DTOBacklog extends Backlog {

    public Backlog convertInBacklog(){
        Backlog backlog = new Backlog();
        backlog.setId(id);
        backlog.setProjectTask(projectTask);
        backlog.setProject(project);
        backlog.setProjectTask(projectTask);

        return backlog;
    }

    public void convertInDTO(Backlog backlog){
        id = backlog.getId();
        projectIdentifier = backlog.getProjectIdentifier();
        project = backlog.getProject();
        projectTask = backlog.getProjectTask();
    }


}
