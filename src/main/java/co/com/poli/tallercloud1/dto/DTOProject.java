package co.com.poli.tallercloud1.dto;

import co.com.poli.tallercloud1.entity.Project;

public class DTOProject extends Project {

    public Project convertInProject(){
        Project project = new Project();
        project.setId(id);
        project.setProjectName(projectName);
        project.setDescription(description);
        project.setStartDate(startDate);
        project.setEndDate(endDate);

        return project;
    }

    public void convertInDTO(Project project){
        id = project.getId();
        projectName = project.getProjectName();
        description = project.getDescription();
        startDate = project.getStartDate();
        endDate = project.getEndDate();
    }


}
