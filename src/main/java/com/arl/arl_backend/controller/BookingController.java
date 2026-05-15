package com.arl.arl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arl.arl_backend.entity.Booking;
import com.arl.arl_backend.response.ApiResponse;
import com.arl.arl_backend.service.BookingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bookings")
public class BookingController {


    @Autowired
    private  BookingService bookingService;

    @PostMapping
    public ApiResponse<Booking> addBooking(@Valid @RequestBody Booking booking){
        Booking newBooking = new Booking();
        newBooking.setFromLocation(booking.getFromLocation());
        newBooking.setToLocation(booking.getToLocation());
        newBooking.setMaterialType(booking.getMaterialType());
        newBooking.setFreightAmount(booking.getFreightAmount());
        newBooking.setAdvanceAmount(booking.getAdvanceAmount());
        newBooking.setRemainingAmount(booking.getRemainingAmount());
        newBooking.setStatus(booking.getStatus());
        newBooking.setCustomer(booking.getCustomer());
        newBooking.setVehicle(booking.getVehicle());


       
        Booking saveBooking= bookingService.saveBooking(newBooking);

        return new ApiResponse<>(
            true, "Booking added successfully", saveBooking
        );
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    
}
