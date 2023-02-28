package com.ameotech.services.inventoryservice.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.Menu;
import com.ameotech.services.inventoryservice.repository.MenuRepository;
import com.ameotech.services.inventoryservice.service.MenuService;
import ameotech.services.common.services.BaseService;

@Service
public class MenuServiceImpl extends BaseService <Menu,MenuRepository>implements MenuService {
	@Autowired
	private MenuRepository _repo;
	@Override
	public List<Menu> getMenubySiteId(int siteId) {
		return (List<Menu>) _repo.findbySiteId(siteId);
	}
}
