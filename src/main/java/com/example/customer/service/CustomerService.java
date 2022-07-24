package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.entity.Customer;
import com.example.customer.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public List<Customer>getCustomers(){
		return repository.findAll();
	}
	public Customer getOrderById(int id) {
		return repository.findById(id)
				.orElseThrow(()->new IllegalArgumentException("Invalid id:"+id));
	}

}
