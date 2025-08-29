package com.github.davidinnocent.BookingCalendar.config;


import com.github.davidinnocent.BookingCalendar.entity.BookingAvailability;
import com.github.davidinnocent.BookingCalendar.entity.Property;
import com.github.davidinnocent.BookingCalendar.repository.BookingAvailabilityRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataInitializer {
    
    @Autowired
    private BookingAvailabilityRepository availabilityRepository;
    
    private final String[] destinations = {"Nairobi", "Mombasa", "Kisumu", "Naivasha", "Malindi"};
    private final String[] propertyNames = {"Hotel Deluxe", "Sea Breeze Villa", "Cozy Cottage", "Mountain Inn", "Urban Apartment"};
    
    @PostConstruct
    public void seedData() {
        List<BookingAvailability> records = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 50; i++) {
            String destination = destinations[random.nextInt(destinations.length)];
            LocalDate availableDate = LocalDate.now().plusDays(random.nextInt(30)); // within next 30 days
            
            List<Property> properties = new ArrayList<>();
            int propertyCount = 1 + random.nextInt(3); // 1 to 3 properties per date
            for (int j = 0; j < propertyCount; j++) {
                Property property = Property.builder()
                        .name(propertyNames[random.nextInt(propertyNames.length)] + " #" + (j + 1))
                        .build();
                properties.add(property);
            }
            
            BookingAvailability availability = BookingAvailability.builder()
                    .destination(destination)
                    .availableDate(availableDate)
                    .availableProperties(properties)
                    .build();
            
            records.add(availability);
        }
        
        availabilityRepository.saveAll(records);
    }
}
