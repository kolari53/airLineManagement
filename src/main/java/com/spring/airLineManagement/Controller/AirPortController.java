package com.spring.airLineManagement.Controller;

import com.spring.airLineManagement.Service.AirPortService;
import com.spring.airLineManagement.model.AirPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/airport")
public class AirPortController {

    private AirPortService airPortService;

    @Autowired
    public AirPortController(AirPortService airPortService) {
        this.airPortService = airPortService;
    }
    @GetMapping("/allAirport")
    public List<AirPort> get(){
        return airPortService.getAll();
    }

    @PostMapping("/addAirport")
    public void add(@RequestBody AirPort airPort){
        airPortService.add(airPort);
    }

    @PostMapping("/updateAirport")
    public void update(@RequestBody AirPort airPort){
        airPortService.update(airPort);
    }

    @PostMapping("/deleteAirport")
    public void delete(@RequestBody AirPort airPort){
        airPortService.delete(airPort);
    }

    @GetMapping("/airport/{id}")
    public AirPort getByID(@PathVariable int id) {
        return airPortService.getByID(id);
    }
}
