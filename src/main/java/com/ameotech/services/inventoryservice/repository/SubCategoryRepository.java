package com.ameotech.services.inventoryservice.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.ameotech.services.inventoryservice.entity.SubCategory;

import ameotech.services.common.repos.BaseRepository;

@Repository
public interface SubCategoryRepository extends BaseRepository<SubCategory, Integer>{	
	 List<SubCategory> findByCategoryId(int categoryId);
}
