package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class Backlog {
    private Long id;
    @NotEmpty(message = "No debe estar en blanco")
    private String projectIdentifier;
    private Project project;
    private List<Project> projectTask;
}
