package edu.vsu.service;

import edu.vsu.dao.CarDetailDAO;
import edu.vsu.model.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DetailServiceImpl implements DetailService {

    private static CarDetailDAO carDetailDAO;

       @Autowired
    public void setCarDetailDAO(CarDetailDAO carDetailDAO) {
        this.carDetailDAO = carDetailDAO;
    }

    @Override
    public List<Detail> allDetails() {
        return carDetailDAO.allDetails();
    }

    @Override
    public void add(Detail detail) {
        carDetailDAO.add(detail);
    }

    @Override
    public void delete(Detail detail) {
        carDetailDAO.delete(detail);
    }

    @Override
    public void update(Detail detail) {
        carDetailDAO.update(detail);
    }

    @Override
    public Detail getById(int id) {
        return carDetailDAO.getById(id);
    }
}
