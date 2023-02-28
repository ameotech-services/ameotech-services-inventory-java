package com.ameotech.services.inventoryservice.service;

import com.ameotech.services.inventoryservice.entity.ItemSpecs;

import ameotech.services.common.interfaces.IBaseService;

public interface ItemSpecsService extends IBaseService<ItemSpecs>{
public ItemSpecs DeleteByItemId(int itemId) throws Exception;

public  ItemSpecs FindByItemId(int itemId);
}
