package com.github.davidinnocent.BookingCalendar.repository;

import com.github.davidinnocent.BookingCalendar.entity.BookingAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingAvailabilityRepository extends JpaRepository<BookingAvailability, Long> {
    List<BookingAvailability> findByDestination(String destination);
}