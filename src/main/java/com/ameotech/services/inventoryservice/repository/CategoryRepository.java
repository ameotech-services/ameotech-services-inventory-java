package com.ameotech.services.inventoryservice.repository;


import org.springframework.stereotype.Repository;

import com.ameotech.services.inventoryservice.entity.category;

import ameotech.services.common.repos.BaseRepository;

@Repository
public interface CategoryRepository extends BaseRepository<category, Integer> {

}
