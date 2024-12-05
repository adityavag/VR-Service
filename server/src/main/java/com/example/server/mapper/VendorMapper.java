package com.example.server.mapper;

import com.example.server.dao.VendorDAO;
import com.example.server.dto.VendorDTO;

public class VendorMapper {
    public static VendorDAO toVendorDAO(VendorDTO vendorDTO) {
        if(vendorDTO == null) return null;
        VendorDAO vendorDAO = new VendorDAO();
        vendorDAO.setVendorKey(vendorDTO.getVendorKey());
        vendorDAO.setVendorName(vendorDTO.getVendorName());
        vendorDAO.setOwnerName(vendorDTO.getOwnerName());
        vendorDAO.setOwnerPhoneNumber(vendorDTO.getOwnerPhoneNumber());
        vendorDAO.setOwnerEmail(vendorDTO.getOwnerEmail());
        vendorDAO.setContactPersonName(vendorDTO.getContactPersonName());
        vendorDAO.setContactPersonPhoneNumber(vendorDTO.getContactPersonPhoneNumber());
        vendorDAO.setGoogleMapsLocationLink(vendorDTO.getGoogleMapsLocationLink());
        vendorDAO.setSeatingCapacity(vendorDTO.getSeatingCapacity());
        vendorDAO.setParkingAvailable(vendorDTO.isParkingAvailable());
        vendorDAO.setEVChargerAvailable(vendorDTO.isEVChargerAvailable());
        vendorDAO.setWiFiAvailable(vendorDTO.isWiFiAvailable());
        vendorDAO.setSmokingZoneAvailable(vendorDTO.isSmokingZoneAvailable());
        vendorDAO.setPlayAreaForKidsAvailable(vendorDTO.isPlayAreaForKidsAvailable());
        vendorDAO.setWashroomsAvailable(vendorDTO.isWashroomsAvailable());
        vendorDAO.setTotalWashroomCount(vendorDTO.getTotalWashroomCount());
        vendorDAO.setSeparateWashroomsAvailable(vendorDTO.isSeparateWashroomsAvailable());
        vendorDAO.setFemaleWashroomCount(vendorDTO.getFemaleWashroomCount());
        vendorDAO.setMaleWashroomCount(vendorDTO.getMaleWashroomCount());
        vendorDAO.setVegOnly(vendorDTO.isVegOnly());
        vendorDAO.setTwentyFourHourOpen(vendorDTO.isTwentyFourHourOpen());
        vendorDAO.setOpeningHours(vendorDTO.getOpeningHours());
        return vendorDAO;
    }
}
