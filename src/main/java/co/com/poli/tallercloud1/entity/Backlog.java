package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
//@Table(name = "backlog")
public class Backlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    //@NotEmpty(message = "No debe estar en blanco")
    protected String projectIdentifier;
    /*
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    protected Project project;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "project_task_id")
    protected List<Project> projectTask;
*/
}
