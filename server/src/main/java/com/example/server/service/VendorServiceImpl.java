package com.example.server.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.server.dao.VendorDAO;
import com.example.server.dto.VendorDTO;
import com.example.server.mapper.VendorMapper;
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

    @Override
    public List<VendorDTO> getAllVendors() {
        List<VendorDAO> vendorDAOs = vendorRepository.findAll();
        return vendorDAOs.stream().map(t -> VendorMapper.toVendorDTO(t)).collect(Collectors.toList());
    }
}
