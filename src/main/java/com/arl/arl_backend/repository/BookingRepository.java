package com.arl.arl_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arl.arl_backend.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    
}
