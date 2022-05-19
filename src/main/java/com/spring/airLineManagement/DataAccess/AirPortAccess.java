package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.AirPort;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AirPortAccess implements AirPortDAL{

    private EntityManager entityManager;

    @Autowired
    public AirPortAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<AirPort> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<AirPort> airPorts = session.createQuery("from AirPort",AirPort.class).getResultList();
        return  airPorts;
    }

    @Override
    public void add(AirPort airPort) {
        Session session = entityManager.unwrap(Session.class);
        session.save(airPort);
    }

    @Override
    public void update(AirPort airPort) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(airPort);
    }

    @Override
    public void delete(AirPort airPort) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(airPort);
    }

    @Override
    public AirPort getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        AirPort airPort = session.get(AirPort.class,id);
        return airPort;
    }
}
