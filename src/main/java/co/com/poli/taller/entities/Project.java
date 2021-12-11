package co.com.poli.taller.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "project")
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @NotEmpty(message = "No puede estar en blanco")
    @Column(unique = true)
    protected String projectName;

    @NotEmpty(message = "No puede estar en blanco")
    @Column(unique = true, updatable = false)
    @Size(min = 5, max = 7)
    protected String projectIdentifier;

    @NotEmpty(message = "No puede estar en blanco")
    protected String description;

    protected Date startDate;

    protected Date endDate;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "backlog_id")
    protected Backlog backlog;
}