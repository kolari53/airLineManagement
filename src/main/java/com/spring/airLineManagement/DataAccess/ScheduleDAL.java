package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.Schedule;

import java.util.List;

public interface ScheduleDAL {
    List<Schedule> getAll();
    void add(Schedule schedule);
    void update(Schedule schedule);
    void delete(Schedule schedule);
    Schedule getByID(int id);
}
