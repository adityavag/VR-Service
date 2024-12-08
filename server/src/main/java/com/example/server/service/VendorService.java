package com.example.server.service;

import java.util.List;

import com.example.server.dto.VendorDTO;

public interface VendorService {

    VendorDTO registerVendor(VendorDTO vendor);

    List<VendorDTO> getAllVendors();

    void deleteVendor(String vendorKey);

    VendorDTO fetchSpecificVendor(String vendorKey);

    VendorDTO updateVendor(String vendorKey, VendorDTO vendor);
}
