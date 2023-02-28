package com.ameotech.services.inventoryservice.service.impl;

import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.MenuType;
import com.ameotech.services.inventoryservice.repository.MenuTypeRepository;
import com.ameotech.services.inventoryservice.service.MenuTypeService;
import ameotech.services.common.services.BaseService;
@Service
public class MenuTypeServiceImpl extends BaseService<MenuType,MenuTypeRepository> implements MenuTypeService {

}
