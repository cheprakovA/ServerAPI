package edu.vsu.dao;

import edu.vsu.model.Detail;

import java.util.List;

public interface CarDetailDAO {

    List<Detail> allDetails();

    void add(Detail detail);
    void delete(Detail detail);
    void update(Detail detail);

    Detail getById(int id);
}
