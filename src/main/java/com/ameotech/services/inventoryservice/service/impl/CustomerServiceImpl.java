package com.ameotech.services.inventoryservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameotech.services.inventoryservice.entity.Customer;
import com.ameotech.services.inventoryservice.entity.Login;
import com.ameotech.services.inventoryservice.repository.CustomerRepository;
import com.ameotech.services.inventoryservice.service.CustomerService;

import ameotech.services.common.services.BaseService;
@Service
public class CustomerServiceImpl extends BaseService<Customer,CustomerRepository> implements CustomerService {
@Autowired
private CustomerRepository _repo;
		
	@Override
	public Customer loginCustomer(Login login) throws Exception{
		Customer customer = null;
		try {
		customer  = _repo.findByCustomerUsernameAndCustomerPassword(login.userName, login.password);
		if(customer==null) {
			throw new Exception("Invalid UserName or Password");
		}
		}
		catch (Exception e) {
			throw e;
		}
		
		return customer;
	}

}
