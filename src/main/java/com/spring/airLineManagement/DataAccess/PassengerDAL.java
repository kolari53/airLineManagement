package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.Passenger;

import java.util.List;

public interface PassengerDAL {
    List<Passenger> getAll();
    void add(Passenger passenger);
    void update(Passenger passenger);
    void delete(Passenger passenger);
    Passenger getByID(int id);
}
