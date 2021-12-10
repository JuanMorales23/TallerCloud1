package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@Entity
@Table(name = "project_task")
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty(message = "No puede estar en blanco")
    protected Long id;
    @NotEmpty(message = "No puede estar en blanco")
    protected String name;
    @NotEmpty(message = "No puede estar en blanco")
    protected String summary;
    protected String acceptanceCriteria;

    protected String status;
    @Positive(message = "El precio debe ser mayor que cero")
    protected Double hours;
    protected Date startDate;
    protected Date endDate;
    @Column(updatable = false)
    protected String projectIdentifier;
    @ManyToOne
    @JoinColumn(name = "backlog_id")
    protected Backlog backlog;
}
