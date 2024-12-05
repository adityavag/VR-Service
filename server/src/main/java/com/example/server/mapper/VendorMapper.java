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
    public static VendorDTO toVendorDTO(VendorDAO vendorDAO) {
        if(vendorDAO == null) return null;
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setVendorKey(vendorDAO.getVendorKey());
        vendorDTO.setVendorName(vendorDAO.getVendorName());
        vendorDTO.setOwnerName(vendorDAO.getOwnerName());
        vendorDTO.setOwnerPhoneNumber(vendorDAO.getOwnerPhoneNumber());
        vendorDTO.setOwnerEmail(vendorDAO.getOwnerEmail());
        vendorDTO.setContactPersonName(vendorDAO.getContactPersonName());
        vendorDTO.setContactPersonPhoneNumber(vendorDAO.getContactPersonPhoneNumber());
        vendorDTO.setGoogleMapsLocationLink(vendorDAO.getGoogleMapsLocationLink());
        vendorDTO.setSeatingCapacity(vendorDAO.getSeatingCapacity());
        vendorDTO.setParkingAvailable(vendorDAO.isParkingAvailable());
        vendorDTO.setEVChargerAvailable(vendorDAO.isEVChargerAvailable());
        vendorDTO.setWiFiAvailable(vendorDAO.isWiFiAvailable());
        vendorDTO.setSmokingZoneAvailable(vendorDAO.isSmokingZoneAvailable());
        vendorDTO.setPlayAreaForKidsAvailable(vendorDAO.isPlayAreaForKidsAvailable());
        vendorDTO.setWashroomsAvailable(vendorDAO.isWashroomsAvailable());
        vendorDTO.setTotalWashroomCount(vendorDAO.getTotalWashroomCount());
        vendorDTO.setSeparateWashroomsAvailable(vendorDAO.isSeparateWashroomsAvailable());
        vendorDTO.setFemaleWashroomCount(vendorDAO.getFemaleWashroomCount());
        vendorDTO.setMaleWashroomCount(vendorDAO.getMaleWashroomCount());
        vendorDTO.setVegOnly(vendorDAO.isVegOnly());
        vendorDTO.setTwentyFourHourOpen(vendorDAO.isTwentyFourHourOpen());
        vendorDTO.setOpeningHours(vendorDAO.getOpeningHours());
        return vendorDTO;
    }
}
