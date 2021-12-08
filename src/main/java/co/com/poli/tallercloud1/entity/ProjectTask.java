package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
public class ProjectTask {
    @NotEmpty(message = "No puede estar en blanco")
    private Long id;
    @NotEmpty(message = "No puede estar en blanco")
    private String name;
    @NotEmpty(message = "No puede estar en blanco")
    private String summary;
    private String acceptanceCriteria;

    private String status;
    @Positive(message = "El precio debe ser mayor que cero")
    private Double hours;
    private Date startDate;
    private Date endDate;
    @Column(updatable = false)
    private String projectIdentifier;
    private Backlog backlog;
}
