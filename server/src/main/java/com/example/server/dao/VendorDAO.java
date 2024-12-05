package com.example.server.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VendorDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendorId;
    private String vendorKey;
    private String vendorName;
    private String ownerName;
    private String ownerPhoneNumber;
    private String ownerEmail;
    private String contactPersonName;
    private String contactPersonPhoneNumber;
    private String googleMapsLocationLink;
    private int seatingCapacity;
    private boolean isParkingAvailable; 
    private boolean isEVChargerAvailable; 
    private boolean isWiFiAvailable; 
    private boolean isSmokingZoneAvailable; 
    private boolean isPlayAreaForKidsAvailable; 
    private boolean washroomsAvailable;
    private int totalWashroomCount;
    private boolean isSeparateWashroomsAvailable;
    private int femaleWashroomCount;
    private int maleWashroomCount;
    private boolean isVegOnly;
    private boolean isTwentyFourHourOpen;
    private String openingHours;
}
