package com.ameotech.services.inventoryservice.service.impl;

import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.Location;
import com.ameotech.services.inventoryservice.repository.LocationRepository;
import com.ameotech.services.inventoryservice.service.LocationService;

import ameotech.services.common.services.BaseService;
@Service
public class LocationServiceImpl extends BaseService<Location, LocationRepository> implements LocationService {	
}
