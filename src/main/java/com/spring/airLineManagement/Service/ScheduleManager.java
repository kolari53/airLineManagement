package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.DataAccess.ScheduleDAL;
import com.spring.airLineManagement.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScheduleManager implements ScheduleService{

    private ScheduleDAL scheduleDAL;

    @Autowired
    public ScheduleManager(ScheduleDAL scheduleDAL) {
        this.scheduleDAL = scheduleDAL;
    }

    @Override
    @Transactional
    public List<Schedule> getAll() {
        return this.scheduleDAL.getAll();
    }

    @Override
    @Transactional
    public void add(Schedule schedule) {
        this.scheduleDAL.add(schedule);
    }

    @Override
    @Transactional
    public void update(Schedule schedule) {
        this.scheduleDAL.update(schedule);
    }

    @Override
    @Transactional
    public void delete(Schedule schedule) {
        this.scheduleDAL.delete(schedule);
    }

    @Override
    @Transactional
    public Schedule getByID(int id) {
        return this.scheduleDAL.getByID(id);
    }
}
