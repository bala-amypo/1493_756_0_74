package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class LocationService implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return Locationrepo.save(le);
    }
    public List<LocationEntity> getAllLocations(){
        return Locationrepo.findAll();
    }
}


package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    private LocationRepository locationRepo;

    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationRepo.save(le);
    }

    @Override
    public List<LocationEntity> getAllLocations() {
        return locationRepo.findAll();
    }
}
