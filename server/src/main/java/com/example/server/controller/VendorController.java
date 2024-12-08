package com.example.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.dto.VendorDTO;
import com.example.server.service.VendorService;

@RestController
@RequestMapping("/api/vendors")
@CrossOrigin(origins = "http://localhost:5173/")
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

    @GetMapping("/")
    public ResponseEntity<List<VendorDTO>> getAllVendors() {
        try {
            List<VendorDTO> vendors = vendorService.getAllVendors();
            return new ResponseEntity<>(vendors, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }
    @DeleteMapping("/delete/{vendorKey}")
    public ResponseEntity<?> deleteVendor(@PathVariable String vendorKey) {
        vendorService.deleteVendor(vendorKey);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{vendorKey}")
    public ResponseEntity<VendorDTO> fetchSpecificVendor(@PathVariable String vendorKey) {
        VendorDTO vendor = vendorService.fetchSpecificVendor(vendorKey);
        return new ResponseEntity<>(vendor, HttpStatus.OK);
    }
    @PutMapping("/{vendorKey}")
    public ResponseEntity<VendorDTO> updateVendor(@PathVariable String vendorKey, @RequestBody VendorDTO vendor) {
        try {
            VendorDTO updatedVendor = vendorService.updateVendor(vendorKey, vendor);
            return new ResponseEntity<>(updatedVendor, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
