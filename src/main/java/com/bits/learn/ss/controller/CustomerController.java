package com.bits.learn.ss.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.learn.ss.model.Customer;
import com.bits.learn.ss.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping()
	public ResponseEntity<Customer> create(@RequestBody Customer employee){
		return new ResponseEntity<Customer>(customerService.create(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Customer> get(@PathVariable("id") long id){
		return new ResponseEntity<Customer>(customerService.get(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Customer>> getAll(){
		return new ResponseEntity<List<Customer>>(customerService.getAll(), HttpStatus.OK);
	}
}
