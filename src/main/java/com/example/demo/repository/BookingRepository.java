package com.example.demo.repository;
// 
////import org.springframework.data.jpa.repository.JpaRepository;
////
////import com.example.demo.Entity.Booking;
////
////public interface BookingRepository extends JpaRepository<Booking, Long> {
////}
// 
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.demo.Entity.Booking;

//public interface BookingRepository extends JpaRepository<Booking, Long> {
//    // Custom queries can be added here if needed
//}
 

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}

