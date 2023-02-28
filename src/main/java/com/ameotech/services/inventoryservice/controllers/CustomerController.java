package com.ameotech.services.inventoryservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameotech.services.inventoryservice.entity.Customer;
import com.ameotech.services.inventoryservice.entity.Login;
import com.ameotech.services.inventoryservice.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
	private CustomerService _customerService;

	@GetMapping("/getall")
	public ResponseEntity<List<Customer>> GetAllCustomers() {
		List<Customer> _customers = null;
		try {
			_customers = _customerService.GetAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<Customer>>(_customers, HttpStatus.OK);
	}

	@GetMapping("/getbyid/{customerId}")
	public ResponseEntity<Customer> GetById(@PathVariable("customerId") int customerId) {
		Customer _customer = null;
		try {
			_customer = _customerService.GetById(customerId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<Customer>(_customer, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<Customer> RegisterCustomer(@RequestBody Customer _customer) {
		Customer customer = null;
		try {
			customer = _customerService.AddUpdate(_customer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{customerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("customerId") int customerId) {
		Customer customer = null;
		try {
			customer = _customerService.Delete(customerId);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Login login) throws Exception {
		//Customer customer = null;
		Customer customer = _customerService.loginCustomer(login);
		if (customer == null) {
			return new ResponseEntity<ResponseModel>(new ResponseModel("Invalid Username or Password"),
					HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		// return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
}
