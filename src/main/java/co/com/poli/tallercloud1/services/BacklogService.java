package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOBacklog;
import co.com.poli.tallercloud1.entity.Backlog;

import java.util.List;


public interface BacklogService {
    List<Backlog> listAll();
    DTOBacklog create(DTOBacklog dtoBacklog);
    void delete(DTOBacklog dtoBacklog);
    Backlog findById(Long id);
}
