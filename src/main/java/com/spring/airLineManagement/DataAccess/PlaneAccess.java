package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.Plane;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PlaneAccess implements PlaneDAL{

    private EntityManager entityManager;

    @Autowired
    public PlaneAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Plane> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Plane> planeList = session.createQuery("from Plane",Plane.class).getResultList();
        return  planeList;
    }

    @Override
    public void add(Plane plane) {
        Session session = entityManager.unwrap(Session.class);
        session.save(plane);
    }

    @Override
    public void update(Plane plane) {
        Session session = entityManager.unwrap(Session.class);
        session.update(plane);
    }

    @Override
    public void delete(Plane plane) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(plane);
    }

    @Override
    public Plane getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Plane plane = session.get(Plane.class,id);
        return plane;
    }
}
