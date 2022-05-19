package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.Passenger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PassengerAccess implements PassengerDAL
{
    private EntityManager entityManager;

    @Autowired
    public PassengerAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Passenger> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Passenger> passengerList = session.createQuery("from Passenger",Passenger.class).getResultList();
        return  passengerList;
    }

    @Override
    public void add(Passenger passenger) {
        Session session = entityManager.unwrap(Session.class);
        session.save(passenger);
    }

    @Override
    public void update(Passenger passenger) {
        Session session = entityManager.unwrap(Session.class);
        session.save(passenger);
    }

    @Override
    public void delete(Passenger passenger) {
        Session session = entityManager.unwrap(Session.class);
        session.save(passenger);
    }

    @Override
    public Passenger getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Passenger passenger = session.get(Passenger.class,id);
        return passenger;
    }
}
