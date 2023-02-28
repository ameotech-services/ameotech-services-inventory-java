package com.ameotech.services.inventoryservice.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameotech.services.inventoryservice.entity.SubCategory;
import com.ameotech.services.inventoryservice.repository.SubCategoryRepository;
import com.ameotech.services.inventoryservice.service.SubCategoryService;

import ameotech.services.common.services.BaseService;


@Service
public class SubCategoryServiceImpl extends BaseService<SubCategory,SubCategoryRepository> implements SubCategoryService {
@Autowired
private SubCategoryRepository _repo;
	@Override
	public List<SubCategory> getAllSubCategories() {
		return (List<SubCategory>) _repo.findAll();
	}

	@Override
	public SubCategory getbyId(int subcategoryId) {
		return _repo.findById(subcategoryId).orElse(null);
	}

	@Override
	public SubCategory addorUpdate(SubCategory subCategory) {
		subCategory.setCreatedDate(LocalDate.now());
		subCategory.setUpdatedTime(LocalDate.now()); 
		return _repo.save(subCategory);
	}

	@Override
	public SubCategory delete(int subcategoryId) throws Exception {
		SubCategory deletedSubCat = null;
		try {
			deletedSubCat = _repo.findById(subcategoryId).orElse(null);
			if(deletedSubCat==null) {
				throw new Exception("No SubCategory Found");
			}
			else {
				_repo.delete(deletedSubCat);
			}
		}
		catch(Exception ex) {
			throw ex;
		}
		return deletedSubCat;
	}

	@Override
	public List<SubCategory> findbyCategoryId(int categoryId) {
		return _repo.findByCategoryId(categoryId);
	}

}
