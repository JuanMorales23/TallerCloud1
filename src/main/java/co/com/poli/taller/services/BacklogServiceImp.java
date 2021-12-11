package co.com.poli.taller.services;

import co.com.poli.taller.entities.Backlog;
import co.com.poli.taller.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacklogServiceImp implements BacklogService{

    @Autowired
    BacklogRepository backlogRepository;

    @Override
    public Backlog create(Backlog backlog) {
        return backlogRepository.save(backlog);
    }

    @Override
    public List<Backlog> findAll() {
        return backlogRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        backlogRepository.deleteById(id);
    }

    @Override
    public Backlog findById(Long id) {
        return backlogRepository.findById(id).orElse(null);
    }
}
