package com.example.server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
