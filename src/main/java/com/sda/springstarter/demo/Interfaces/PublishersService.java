package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Publishers;

import java.util.List;

public interface PublishersService {

    List<Publishers> getAllPublishers();

    void addPublisher(Publishers publisher);

}
