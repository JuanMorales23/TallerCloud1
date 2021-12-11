package co.com.poli.taller.services;

import co.com.poli.taller.entities.Backlog;
import co.com.poli.taller.repository.BacklogRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BacklogServiceImpTest {

    @Autowired
    private BacklogRepository backlogRepository;


    @Test
    void createBacklog(){
      Backlog backlog = Backlog.builder()
              .projectIdentifier("holi")
              .project(null)
              .projectTask(null)
              .build();
      backlogRepository.save(backlog);
      List<Backlog> backlogList = backlogRepository.findAll();
        assertTrue(backlogList.isEmpty());

    }
}