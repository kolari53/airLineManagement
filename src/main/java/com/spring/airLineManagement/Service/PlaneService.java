package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.model.Plane;

import java.util.List;

public interface PlaneService {
    List<Plane> getAll();
    void add(Plane plane);
    void update(Plane plane);
    void delete(Plane plane);
    Plane getByID(int id);
}
