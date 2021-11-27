package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class Project {
    @Id
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;
    private Backlog backlog;
}
