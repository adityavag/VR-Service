package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {
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
