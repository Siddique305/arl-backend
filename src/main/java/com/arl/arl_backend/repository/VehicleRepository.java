package com.arl.arl_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arl.arl_backend.entity.Vehicle;;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
}
