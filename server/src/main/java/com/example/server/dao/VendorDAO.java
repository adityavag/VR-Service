package com.example.server.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty("isParkingAvailable")
    private boolean isParkingAvailable; 
    @JsonProperty("isEVChargerAvailable")
    private boolean isEVChargerAvailable; 
    @JsonProperty("isWiFiAvailable")
    private boolean isWiFiAvailable; 
    @JsonProperty("isSmokingZoneAvailable")
    private boolean isSmokingZoneAvailable; 
    @JsonProperty("isPlayAreaForKidsAvailable")
    private boolean isPlayAreaForKidsAvailable; 
    private boolean washroomsAvailable;
    private int totalWashroomCount;
    @JsonProperty("isSeparateWashroomsAvailable")
    private boolean isSeparateWashroomsAvailable;
    private int femaleWashroomCount;
    private int maleWashroomCount;
    @JsonProperty("isVegOnly")
    private boolean isVegOnly;
    @JsonProperty("isTwentyFourHourOpen")
    private boolean isTwentyFourHourOpen;
    private String openingHours;
}
