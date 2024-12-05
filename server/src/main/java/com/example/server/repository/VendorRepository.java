package com.example.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.server.dao.VendorDAO;

public interface VendorRepository extends JpaRepository<VendorDAO, Long> {

}
