package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Booking;
import com.arl.arl_backend.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {


    @Autowired
    private  BookingService bookingService;

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    
}
