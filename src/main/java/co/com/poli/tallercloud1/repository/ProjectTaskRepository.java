package co.com.poli.tallercloud1.repository;

import co.com.poli.tallercloud1.entity.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long>{

}
