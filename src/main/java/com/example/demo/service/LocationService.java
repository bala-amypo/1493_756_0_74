package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.LocationEntity;

public interface LocationService {
    LocationEntity createlocation(LocationEntity location);
    List<LocationEntity> getAllLocations();

    // Service methods will be implemented here in the future
}