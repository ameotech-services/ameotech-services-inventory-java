package com.ameotech.services.inventoryservice.repository;

import java.util.List;

import com.ameotech.services.inventoryservice.entity.SiteOffer;

import ameotech.services.common.repos.BaseRepository;

public interface SiteOfferRepository extends BaseRepository<SiteOffer, Integer>{
	 List<SiteOffer> findBySiteId(int siteId);
	 List<SiteOffer> findByOfferId(int offerId);
}
