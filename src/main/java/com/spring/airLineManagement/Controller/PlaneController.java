package com.spring.airLineManagement.Controller;

import com.spring.airLineManagement.Service.PlaneService;
import com.spring.airLineManagement.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/plane")
public class PlaneController {
    private PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }
    @GetMapping("/allPlane")
    public List<Plane> get(){
        return planeService.getAll();
    }
    @PostMapping("/addPlane")
    public void add(@RequestBody Plane plane){
        planeService.add(plane);
    }

    @PostMapping("/updatePlane")
    public void update(@RequestBody Plane plane){
        planeService.update(plane);
    }

    @PostMapping("/deletePlane")
    public void delete(@RequestBody Plane plane){
        planeService.delete(plane);
    }

    @GetMapping("/plane/{id}")
    public Plane getByID(@PathVariable int id) {
        return planeService.getByID(id);
    }
}
