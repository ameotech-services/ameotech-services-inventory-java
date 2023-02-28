package com.ameotech.services.inventoryservice.service.impl;

import com.ameotech.services.inventoryservice.entity.Item;
import com.ameotech.services.inventoryservice.service.ItemService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;

public class ItemServiceImpl extends BaseService<Item, BaseRepository<Item,Integer>> implements ItemService{

}
