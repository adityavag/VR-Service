package com.example.server.service;

import java.util.List;

import com.example.server.dto.VendorDTO;

public interface VendorService {

    VendorDTO registerVendor(VendorDTO vendor);

    List<VendorDTO> getAllVendors();
}
