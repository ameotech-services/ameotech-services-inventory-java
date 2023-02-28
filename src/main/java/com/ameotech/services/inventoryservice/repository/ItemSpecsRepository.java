package com.ameotech.services.inventoryservice.repository;

import com.ameotech.services.inventoryservice.entity.ItemSpecs;

import ameotech.services.common.repos.BaseRepository;

public interface ItemSpecsRepository extends BaseRepository<ItemSpecs, Integer>{
	public ItemSpecs deleteByItemId(int itemId);
	public ItemSpecs findByItemId(int itemId);
}
