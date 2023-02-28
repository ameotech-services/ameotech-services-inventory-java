package com.ameotech.services.inventoryservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ameotech.services.inventoryservice.entity.ItemSpecs;
import com.ameotech.services.inventoryservice.repository.ItemSpecsRepository;
import com.ameotech.services.inventoryservice.service.ItemSpecsService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;

public class ItemSpecsServiceImpl extends BaseService<ItemSpecs, BaseRepository<ItemSpecs, Integer>>
		implements ItemSpecsService {
	@Autowired
	private ItemSpecsRepository _repo;
	
	@Override
	public  ItemSpecs FindByItemId(int itemId) {
		ItemSpecs _itemSpecs = null;
		_itemSpecs = _repo.findByItemId(itemId);
		return _itemSpecs;
	}

	@Override
	public ItemSpecs DeleteByItemId(int itemId) throws Exception {
		ItemSpecs _itemSpecs = null;
		try {
			_itemSpecs = _repo.findByItemId(itemId);
			if (_itemSpecs == null) {
				throw new Exception("No Specs Found against this Item.");
			}
			else {
				_repo.deleteByItemId(itemId);
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return _itemSpecs;
	}

}
