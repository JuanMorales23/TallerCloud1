package co.com.poli.taller.services;

import co.com.poli.taller.entities.Backlog;

import java.util.List;

public interface BacklogService {
    Backlog create(Backlog backlog);
    List<Backlog> findAll( );
    void delete(Long id);
    Backlog findById(Long id);
}
