package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.model.AirPort;

import java.util.List;

public interface AirPortService {
    List<AirPort> getAll();
    void add(AirPort airPort);
    void update(AirPort airPort);
    void delete(AirPort airPort);
    AirPort getByID(int id);
}
