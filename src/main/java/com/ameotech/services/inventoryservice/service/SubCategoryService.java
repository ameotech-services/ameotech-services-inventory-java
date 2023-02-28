package com.ameotech.services.inventoryservice.service;

import java.util.List;

import com.ameotech.services.inventoryservice.entity.SubCategory;

public interface SubCategoryService {
	public List<SubCategory> getAllSubCategories();

	public SubCategory getbyId(int subcategoryId);

	public SubCategory addorUpdate(SubCategory subCategory);

	public SubCategory delete(int subcategoryId) throws Exception;
	
	public List<SubCategory> findbyCategoryId(int categoryId);
}
