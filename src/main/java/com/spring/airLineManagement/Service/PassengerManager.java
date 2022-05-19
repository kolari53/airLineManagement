package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.DataAccess.PassengerDAL;
import com.spring.airLineManagement.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerManager implements PassengerService{

    private PassengerDAL passengerDAL;

    @Autowired
    public PassengerManager(PassengerDAL passengerDAL) {
        this.passengerDAL = passengerDAL;
    }

    @Override
    @Transactional
    public List<Passenger> getAll() {
        return this.passengerDAL.getAll();
    }

    @Override
    @Transactional
    public void add(Passenger passenger) {
        this.passengerDAL.add(passenger);
    }

    @Override
    @Transactional
    public void update(Passenger passenger) {
        this.passengerDAL.update(passenger);
    }

    @Override
    @Transactional
    public void delete(Passenger passenger) {
        this.passengerDAL.delete(passenger);
    }

    @Override
    @Transactional
    public Passenger getByID(int id) {
        return this.passengerDAL.getByID(id);
    }
}
