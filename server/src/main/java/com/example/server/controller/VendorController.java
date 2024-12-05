package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.dto.VendorDTO;
import com.example.server.service.VendorService;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
    @Autowired
    VendorService vendorService;

    @PostMapping("/")
    public ResponseEntity<VendorDTO> registerVendor(@RequestBody VendorDTO vendor) {
        try {
            VendorDTO registeredVendor = vendorService.registerVendor(vendor);
            return new ResponseEntity<>(registeredVendor, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
