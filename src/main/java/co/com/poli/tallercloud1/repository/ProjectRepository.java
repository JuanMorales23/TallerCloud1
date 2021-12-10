package co.com.poli.tallercloud1.repository;

import co.com.poli.tallercloud1.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long> {

}
