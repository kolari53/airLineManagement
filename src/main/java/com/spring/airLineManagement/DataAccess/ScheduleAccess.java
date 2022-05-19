package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.Plane;
import com.spring.airLineManagement.model.Schedule;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ScheduleAccess implements ScheduleDAL{

    private EntityManager entityManager;

    @Autowired
    public ScheduleAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Schedule> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Schedule> scheduleList = session.createQuery("from Schedule",Schedule.class).getResultList();
        return  scheduleList;
    }

    @Override
    public void add(Schedule schedule) {
        Session session = entityManager.unwrap(Session.class);
        session.save(schedule);
    }

    @Override
    public void update(Schedule schedule) {
        Session session = entityManager.unwrap(Session.class);
        session.update(schedule);
    }

    @Override
    public void delete(Schedule schedule) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(schedule);
    }

    @Override
    public Schedule getByID(int id) {
        Session session = entityManager.unwrap(Session.class);
        Schedule schedule = session.get(Schedule.class,id);
        return schedule;
    }
}
