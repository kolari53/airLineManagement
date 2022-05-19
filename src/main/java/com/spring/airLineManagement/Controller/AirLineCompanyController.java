package com.spring.airLineManagement.Controller;

import com.spring.airLineManagement.Service.AirLineCompanyService;
import com.spring.airLineManagement.model.AirLineCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/airline")
public class AirLineCompanyController {
    private AirLineCompanyService airLineCompanyService;

    @Autowired
    public AirLineCompanyController(AirLineCompanyService airLineCompanyService) {
        this.airLineCompanyService = airLineCompanyService;
    }
    @GetMapping("/allAirline")
    public List<AirLineCompany> get(){
        return  airLineCompanyService.getAll();
    }
    @PostMapping("/addAirline")
    public void add(@RequestBody AirLineCompany airLineCompany){
        airLineCompanyService.add(airLineCompany);
    }
    @PostMapping("/updateAirline")
    public void update(@RequestBody AirLineCompany airLineCompany){
        airLineCompanyService.update(airLineCompany);
    }
    @PostMapping("/deleteAirline")
    public void delete(@RequestBody AirLineCompany airLineCompany){
        airLineCompanyService.delete(airLineCompany);
    }
    @GetMapping("/airline/{id}")
    public  AirLineCompany getByID(@PathVariable int id) {
        return airLineCompanyService.getByID(id);
    }
}
