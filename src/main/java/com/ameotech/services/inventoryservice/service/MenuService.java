package com.ameotech.services.inventoryservice.service;


import java.util.List;

import com.ameotech.services.inventoryservice.entity.Menu;
import ameotech.services.common.interfaces.IBaseService;

public interface MenuService extends IBaseService<Menu>{
	public List<Menu> getMenubySiteId(int siteId) ;
}
