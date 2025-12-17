package com.example.demo.controller;

import java.util.List;
import java.lang.reflect.Accessflag.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.LocationService;


@RestController
public class LocationController {
    @Autowired
    LocationService locationservice;
    @PostMapping("/addstudent")
    public LocationEntity createlocation(@RequestBody LocationEntity le){
        return locationservice.createlocation(le);
    }
    @GetMapping("/showlocations")
    public List<LocationEntity> showlocations(){
        return locationservice.getAllLocations();
    }
}