package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.Interfaces.PublishersService;
import com.sda.springstarter.demo.model.Publishers;
import com.sda.springstarter.demo.repository.PublishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublishersService {

    @Autowired
    PublishersRepository publishersRepository;

    @Override
    public List<Publishers> getAllPublishers() {
        return publishersRepository.findAll();
    }

    @Override
    public void addPublisher(Publishers publisher) {
        publishersRepository.save(publisher);
    }

    public Publishers getPublisherById(int id) {
      return publishersRepository.findById(id);
    }
}
