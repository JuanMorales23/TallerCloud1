package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.Backlog;

import java.util.List;

public interface BacklogService {
    List<Backlog> listAll();
    void create(Backlog backlog);
    void delete(Backlog backlog);
    Backlog findById(Backlog backlog);
}
