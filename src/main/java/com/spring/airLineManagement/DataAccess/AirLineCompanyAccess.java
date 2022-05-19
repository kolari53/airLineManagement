package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.AirLineCompany;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AirLineCompanyAccess implements AirLineCompanyDAL{

    private EntityManager entityManager;

    @Autowired
    public AirLineCompanyAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<AirLineCompany> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<AirLineCompany> airLineCompanyList = session.createQuery("from AirLineCompany",AirLineCompany.class).getResultList();
        return  airLineCompanyList;
    }

    @Override
    public void add(AirLineCompany airLineCompany) {
        Session session = entityManager.unwrap(Session.class);
        session.save(airLineCompany);
    }

    @Override
    public void update(AirLineCompany airLineCompany) {
        Session session = entityManager.unwrap(Session.class);
        session.update(airLineCompany);
    }

    @Override
    public void delete(AirLineCompany airLineCompany) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(airLineCompany);
    }

    @Override
    public AirLineCompany getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        AirLineCompany airLineCompany = session.get(AirLineCompany.class,id);
        return airLineCompany;
    }
}
