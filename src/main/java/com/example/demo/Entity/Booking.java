package com.example.demo.Entity;

//import java.time.LocalDate;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import jakarta.persistence.*;
//import lombok.*;
//import java.time.LocalDate;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Booking {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")  
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "userId", nullable = false)   
//    private User user;  
//
//    @ManyToOne
//    @JoinColumn(name = "roomId", nullable = false)  
//    private Room room; 
//
//    @Column(name = "checkIn")  
//    private LocalDate checkIn;
//
//    @Column(name = "checkOut")   
//    private LocalDate checkOut;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "status")  
//    private Status status = Status.CONFIRMED;
//
//    public enum Status {
//        CONFIRMED, CANCELLED
//    }
//}
// 
 

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "guest_name", nullable = false)
    private String guestName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(name = "room_id", nullable = false)
    private Integer roomId;

    @Column(name = "check_in_date", nullable = false)
    private LocalDate checkInDate;

    @Column(name = "check_out_date", nullable = false)
    private LocalDate checkOutDate;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
