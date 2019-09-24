package edu.vsu.dao;

import edu.vsu.model.Detail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public final class CarDetailDAOImpl implements CarDetailDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);

    private static Map<Integer, Detail> details = new HashMap<>();

    static {
        Detail detail = new Detail();
        detail.setId(AUTO_ID.getAndIncrement());
        detail.setCarId(13);
        detail.setDetailTypeId(0);
        detail.setTitle("Carb");
        details.put(detail.getId(), detail);
    }

    @Override
    public List<Detail> allDetails() {
        return new ArrayList<>(details.values());
    }

    @Override
    public void add(Detail detail) {
        detail.setId(AUTO_ID.getAndIncrement());
        details.put(detail.getId(), detail);
    }

    @Override
    public void delete(Detail detail) {
        details.remove(detail.getId());
    }

    @Override
    public void update(Detail detail) {
        details.put(detail.getId(), detail);
    }

    @Override
    public Detail getById(int id) {
        return details.get(id);
    }
}
