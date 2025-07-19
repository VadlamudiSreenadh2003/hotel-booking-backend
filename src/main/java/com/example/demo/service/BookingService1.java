package com.example.demo.service;
import java.util.List;

import com.example.demo.Entity.Booking;

public interface BookingService1 {
    Booking createBooking(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(Integer id);
}
