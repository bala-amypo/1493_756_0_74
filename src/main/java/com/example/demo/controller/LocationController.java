package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/addlocation")
    public LocationEntity createlocation(@RequestBody LocationEntity le) {
        return locationService.createlocation(le);
    }

    @GetMapping("/showlocations")
    public List<LocationEntity> showlocations() {
        return locationService.getAllLocations();
    }
}
