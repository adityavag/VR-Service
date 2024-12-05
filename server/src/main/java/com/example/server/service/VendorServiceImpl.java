package com.example.server.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.dao.VendorDAO;
import com.example.server.dto.VendorDTO;
import com.example.server.repository.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    VendorRepository vendorRepository;

    @Override
    public VendorDTO registerVendor(VendorDTO vendor) {
        VendorDAO vendorDAO = new VendorDAO();
        BeanUtils.copyProperties(vendor, vendorDAO);
        vendorRepository.save(vendorDAO);
        return vendor;
    }
}
