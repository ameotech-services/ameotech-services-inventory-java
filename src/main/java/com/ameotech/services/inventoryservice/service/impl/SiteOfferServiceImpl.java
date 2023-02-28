package com.ameotech.services.inventoryservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameotech.services.inventoryservice.entity.SiteOffer;
import com.ameotech.services.inventoryservice.repository.SiteOfferRepository;
import com.ameotech.services.inventoryservice.service.SiteOfferService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;
@Service
public class SiteOfferServiceImpl extends BaseService<SiteOffer, BaseRepository<SiteOffer,Integer>> implements SiteOfferService{ 
@Autowired
private SiteOfferRepository _repo;
	@Override	
	public List<SiteOffer> GetBySiteId(int siteId){
		List<SiteOffer> siteoffers = null;
		try {
			siteoffers =	_repo.findBySiteId(siteId);
		}catch(Exception e) {
			
		}
		return siteoffers;
	}
	
	@Override	
	public List<SiteOffer> GetByOfferId(int offerId){
		List<SiteOffer> siteoffers = null;
		try {
			siteoffers =	_repo.findByOfferId(offerId);	
		}catch(Exception e) {
			
		}
		return siteoffers;
	}
}
