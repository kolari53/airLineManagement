package com.spring.airLineManagement.Controller;

import com.spring.airLineManagement.Service.PassengerService;
import com.spring.airLineManagement.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/passenger")
public class PassengerController {
    private PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }
    @GetMapping("/allPassenger")
    public List<Passenger> get(){
        return passengerService.getAll();
    }
    @PostMapping("/addPassenger")
    public void add(@RequestBody Passenger passenger){
        passengerService.add(passenger);
    }

    @PostMapping("/updatePassenger")
    public void update(@RequestBody Passenger passenger){
        passengerService.update(passenger);
    }

    @PostMapping("/deletePassenger")
    public void delete(@RequestBody Passenger passenger){
        passengerService.delete(passenger);
    }

    @GetMapping("/{id}")
    public Passenger getByID(@PathVariable int id) {
        return passengerService.getByID(id);
    }
}
