package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Vehicle;
import com.arl.arl_backend.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehile(vehicle);
    }
    
    @GetMapping
    public List<Vehicle> getAllVehicle(){
        return vehicleService.getAllVehicle();
    }
}
