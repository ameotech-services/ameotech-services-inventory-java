package com.ameotech.services.inventoryservice.service.impl;


import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.category;
import com.ameotech.services.inventoryservice.repository.CategoryRepository;
import com.ameotech.services.inventoryservice.service.CategoryService;
import ameotech.services.common.services.BaseService;

@Service
public class CategoryServiceImpl extends BaseService<category, CategoryRepository> implements CategoryService  {	
	

}
