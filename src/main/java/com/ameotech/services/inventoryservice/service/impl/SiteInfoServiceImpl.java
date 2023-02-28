package com.ameotech.services.inventoryservice.service.impl;

import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.SiteInfo;
import com.ameotech.services.inventoryservice.repository.SIteInfoRepository;
import com.ameotech.services.inventoryservice.service.SiteInfoService;

import ameotech.services.common.services.BaseService;
@Service
public class SiteInfoServiceImpl extends BaseService<SiteInfo,SIteInfoRepository> implements SiteInfoService {

}
