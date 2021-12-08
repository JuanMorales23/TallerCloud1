package co.com.poli.tallercloud1.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data

public class Project {
    private Long id;
    @NotEmpty(message = "No puede estar en blanco")

    private String projectName;
    @NotEmpty(message = "No puede estar en blanco")
    @Size(min = 5, max = 7)
    private String projectIdentifier;
    @NotEmpty(message = "No puede estar en blanco")
    private String description;
    private Date startDate;
    private Date endDate;
    private Backlog backlog;
}
