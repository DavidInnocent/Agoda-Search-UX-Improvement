package com.github.davidinnocent.BookingCalendar.controllers;


import com.github.davidinnocent.BookingCalendar.entity.BookingAvailability;
import com.github.davidinnocent.BookingCalendar.repository.BookingAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/availability")
@CrossOrigin(origins = "*")
public class BookingAvailabilityController {

    @Autowired
    private BookingAvailabilityRepository availabilityRepository;

    @GetMapping("/{destination}")
    public List<BookingAvailability> getAvailableDates(@PathVariable String destination) {
        return availabilityRepository.findByDestination(destination);
    }
}