package com.xchart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xchart.demo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
