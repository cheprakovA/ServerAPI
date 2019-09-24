package edu.vsu.service;

import edu.vsu.model.Detail;

import java.util.List;

public interface DetailService {

    List<Detail> allDetails();

    void add(Detail detail);
    void delete(Detail detail);
    void update(Detail detail);

    Detail getById(int id);

}
