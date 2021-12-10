package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.entity.Backlog;
import co.com.poli.tallercloud1.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BacklogServiceImpl implements BacklogService {
    @Autowired
    BacklogRepository backlogRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Backlog> listAll() {
        return backlogRepository.findAll();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(Backlog backlog) {
        backlogRepository.save(backlog);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Backlog backlog) {
        backlogRepository.delete(backlog);
    }

    @Override
    @Transactional(readOnly = true)
    public Backlog findById(Backlog backlog) {
        return backlogRepository.findById(backlog.getId()).orElse(null);
    }
}
