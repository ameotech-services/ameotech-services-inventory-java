package com.ameotech.services.inventoryservice.service.impl;

import org.springframework.stereotype.Service;
import com.ameotech.services.inventoryservice.entity.Offer;
import com.ameotech.services.inventoryservice.repository.OfferRepository;
import com.ameotech.services.inventoryservice.service.OfferService;
import ameotech.services.common.services.BaseService;

@Service
public class OfferServiceImpl extends BaseService<Offer, OfferRepository> implements OfferService {

}
