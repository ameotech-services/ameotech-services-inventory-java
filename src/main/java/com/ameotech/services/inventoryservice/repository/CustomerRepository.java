package com.ameotech.services.inventoryservice.repository;

import org.springframework.stereotype.Repository;

import com.ameotech.services.inventoryservice.entity.Customer;

import ameotech.services.common.repos.BaseRepository;
@Repository
public interface CustomerRepository extends BaseRepository<Customer, Integer>{
	Customer findByCustomerUsernameAndCustomerPassword(String customerUserName, String customerPassword);
}
