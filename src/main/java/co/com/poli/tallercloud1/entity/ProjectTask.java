package co.com.poli.tallercloud1.entity;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class ProjectTask {
    @Id
    private Long id;
    private String name;
    private String summary;
    private String acceptanceCriteria;
    private String status;
    private Integer priority;
    private Double hours;
    private Date startDate;
    private Date endDate;
    private String projectIdentifier;
    private Backlog backlog;
}
