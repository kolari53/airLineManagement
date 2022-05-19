package com.spring.airLineManagement.Controller;

import com.spring.airLineManagement.Service.ScheduleService;
import com.spring.airLineManagement.model.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }
    @GetMapping("/allSchedule")
    public List<Schedule> get(){
        return scheduleService.getAll();
    }
    @PostMapping("/addSchedule")
    public void add(@RequestBody Schedule schedule){
        System.out.println("Controller 27  : " + schedule.toString());
        scheduleService.add(schedule);
    }

    @PostMapping("/updateSchedule")
    public void update(@RequestBody Schedule schedule){
        scheduleService.update(schedule);
    }

    @PostMapping("/deleteSchedule")
    public void delete(@RequestBody Schedule schedule){
        scheduleService.delete(schedule);
    }

    @GetMapping("/schedule/{id}")
    public Schedule getByID(@PathVariable int id) {
        return scheduleService.getByID(id);
    }
}
