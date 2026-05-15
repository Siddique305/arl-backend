package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Vehicle;
import com.arl.arl_backend.response.ApiResponse;
import com.arl.arl_backend.service.VehicleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ApiResponse<Vehicle> saveVehicle(@Valid @RequestBody Vehicle vehicle){
        Vehicle newVehicle = new Vehicle();
        newVehicle.setVehicleNumber(vehicle.getVehicleNumber());
        newVehicle.setOwnerName(vehicle.getOwnerName());
        newVehicle.setOwnerMobile(vehicle.getOwnerMobile());
        newVehicle.setDriverName(vehicle.getDriverName());
        newVehicle.setDriverMobile(vehicle.getDriverMobile());
        newVehicle.setVehicleType(vehicle.getVehicleType());
        newVehicle.setAvailable(vehicle.getAvailable());



        Vehicle savedVehicle = vehicleService.saveVehile(newVehicle);
        return new ApiResponse<>(
            true, "Vehicle added successfully", savedVehicle
        );
    }
    
    @GetMapping
    public List<Vehicle> getAllVehicle(){
        return vehicleService.getAllVehicle();
    }
}
