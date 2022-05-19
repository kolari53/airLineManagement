package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.AirPort;

import java.util.List;

public interface AirPortDAL {
    List<AirPort> getAll();
    void add(AirPort airPort);
    void update(AirPort airPort);
    void delete(AirPort airPort);
    AirPort getByID(int id);
}
