package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAll();
    void add(Schedule schedule);
    void update(Schedule schedule);
    void delete(Schedule schedule);
    Schedule getByID(int id);
}
