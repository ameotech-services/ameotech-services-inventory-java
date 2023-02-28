package com.ameotech.services.inventoryservice.service;

import com.ameotech.services.inventoryservice.entity.Customer;
import com.ameotech.services.inventoryservice.entity.Login;
import ameotech.services.common.interfaces.IBaseService;

public interface CustomerService  extends IBaseService<Customer>{		
	public Customer loginCustomer(Login login) throws Exception;
}
