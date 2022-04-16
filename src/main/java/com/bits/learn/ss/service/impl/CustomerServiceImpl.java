package com.bits.learn.ss.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bits.learn.ss.exception.CustomerNotFoundException;
import com.bits.learn.ss.model.Customer;
import com.bits.learn.ss.repository.CustomerRepository;
import com.bits.learn.ss.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer get(long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			return customer.get();
		}else {
			throw new CustomerNotFoundException("Customer","Id",id);
		}
	}

	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

}
