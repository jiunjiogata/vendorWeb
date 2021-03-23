package com.rjo.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rjo.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
