package co.com.poli.tallercloud1.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "No puede estar en blanco")
    @Column(unique = true)
    private String projectName;
    @NotEmpty(message = "No puede estar en blanco")
    @Column(unique = true, updatable = false)
    @Size(min = 5, max = 7)
    private String projectIdentifier;
    @NotEmpty(message = "No puede estar en blanco")
    private String description;
    private Date startDate;
    private Date endDate;
    @OneToOne
    @JoinColumn(name = "backlog_id")
    private Backlog backlog;
}
