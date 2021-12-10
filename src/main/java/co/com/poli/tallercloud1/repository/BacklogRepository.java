package co.com.poli.tallercloud1.repository;

import co.com.poli.tallercloud1.entity.Backlog;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Long> {

}
