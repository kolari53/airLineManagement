package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.model.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> getAll();
    void add(Passenger passenger);
    void update(Passenger passenger);
    void delete(Passenger passenger);
    Passenger getByID(int id);
}
