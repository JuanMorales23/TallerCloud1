package co.com.poli.taller.services;


import co.com.poli.taller.entities.Project;

import java.util.List;

public interface ProjectService {
    Project create(Project project);
    List<Project> findAll( );
    void delete(Long id);
    Project findById(Long id);
}
