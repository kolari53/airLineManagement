package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.DataAccess.PlaneDAL;
import com.spring.airLineManagement.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlaneManager implements PlaneService{
    private PlaneDAL planeDAL;

    @Autowired
    public PlaneManager(PlaneDAL planeDAL) {
        this.planeDAL = planeDAL;
    }

    @Override
    @Transactional
    public List<Plane> getAll() {
        return planeDAL.getAll();
    }

    @Override
    @Transactional
    public void add(Plane plane) {
        this.planeDAL.add(plane);
    }

    @Override
    @Transactional
    public void update(Plane plane) {
        this.planeDAL.update(plane);
    }

    @Override
    @Transactional
    public void delete(Plane plane) {
        this.planeDAL.delete(plane);
    }

    @Override
    @Transactional
    public Plane getByID(int id) {
        return this.planeDAL.getByID(id);
    }
}
