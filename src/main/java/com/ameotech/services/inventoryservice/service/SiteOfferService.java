package com.ameotech.services.inventoryservice.service;

import java.util.List;

import com.ameotech.services.inventoryservice.entity.SiteOffer;

import ameotech.services.common.interfaces.IBaseService;

public interface SiteOfferService extends IBaseService<SiteOffer> {
public List<SiteOffer> GetBySiteId(int siteId);
public List<SiteOffer> GetByOfferId(int offerId);
}
