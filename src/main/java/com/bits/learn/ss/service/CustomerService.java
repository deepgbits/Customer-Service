package com.bits.learn.ss.service;

import java.util.List;

import com.bits.learn.ss.model.Customer;

public interface CustomerService {
	
	public Customer create(Customer customer);
	public Customer get(long id);	
	public List<Customer> getAll();
}
