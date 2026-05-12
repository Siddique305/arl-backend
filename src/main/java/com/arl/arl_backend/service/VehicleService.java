package com.arl.arl_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arl.arl_backend.entity.Vehicle;
import com.arl.arl_backend.repository.VehicleRepository;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle saveVehile(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicle(){
        return vehicleRepository.findAll();
    }
    
}
