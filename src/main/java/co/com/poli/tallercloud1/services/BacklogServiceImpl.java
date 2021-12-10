package co.com.poli.tallercloud1.services;

import co.com.poli.tallercloud1.repository.BacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BacklogServiceImpl implements BacklogService {

    @Autowired
    BacklogRepository backlogRepository;
}
