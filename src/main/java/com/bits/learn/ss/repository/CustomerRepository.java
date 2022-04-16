package com.bits.learn.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.learn.ss.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
