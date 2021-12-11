package co.com.poli.taller.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity
@Data
@Table(name = "project_task")
@Builder
public class ProjectTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotEmpty(message = "No puede estar en blanco")
    protected String name;

    @NotEmpty(message = "No puede estar en blanco")
    protected String summary;

    protected String acceptanceCriteria;

    protected String status;

    @Min(value=1, message = "El campo priority inicia en 1")
    @Max(value=8, message = "El campo priority termina en 8")
    @Positive(message = "El precio debe ser mayor que cero")
    protected Double hours;

    protected Date startDate;

    protected Date endDate;

    @Column(updatable = false)
    protected String projectIdentifier;

    @ManyToOne
    //@JoinColumn(name = "backlog_id")
    protected Backlog backlog;

    public ProjectTask() {

    }
}