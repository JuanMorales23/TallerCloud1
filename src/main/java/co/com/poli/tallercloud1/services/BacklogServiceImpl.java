package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.dto.DTOBacklog;
import co.com.poli.tallercloud1.entity.Backlog;
import co.com.poli.tallercloud1.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BacklogServiceImpl implements BacklogService {
    @Autowired
    private BacklogRepository backlogRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Backlog> listAll() {
        return backlogRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DTOBacklog create(DTOBacklog dtoBacklog) {
        return backlogRepository.save(dtoBacklog);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(DTOBacklog dtoBacklog) {
        backlogRepository.delete(dtoBacklog);
    }

    @Override
    @Transactional(readOnly = true)
    public Backlog findById(Long id) {
        return backlogRepository.findById(id).orElse(null);
    }
}
