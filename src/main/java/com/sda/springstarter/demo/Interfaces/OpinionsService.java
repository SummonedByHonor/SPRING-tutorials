package com.sda.springstarter.demo.Interfaces;

import com.sda.springstarter.demo.model.Opinions;

import java.util.List;

public interface OpinionsService {

    void addOpinion(Opinions opinion);

    List<Opinions> getAllOpinions();
}
