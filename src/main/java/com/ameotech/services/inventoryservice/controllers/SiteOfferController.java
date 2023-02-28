package com.ameotech.services.inventoryservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameotech.services.inventoryservice.entity.SiteOffer;
import com.ameotech.services.inventoryservice.service.SiteOfferService;

@RestController
@RequestMapping("/api/site-offer")
public class SiteOfferController {
	@Autowired
	private SiteOfferService _siteofferService;

	@GetMapping("/getall")
	public ResponseEntity<List<SiteOffer>> GetAll(){
		List<SiteOffer> siteOffers = null;
		try {
			siteOffers = _siteofferService.GetAll();
		}
		catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<SiteOffer>>(siteOffers,HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{siteOfferId}")
	public ResponseEntity<SiteOffer> GetById(@PathVariable(name="siteOfferId") int siteOfferId){
		SiteOffer siteOffer = null;
		try {
			siteOffer= _siteofferService.GetById(siteOfferId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SiteOffer>(siteOffer, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<SiteOffer> AddUpdatte(@RequestBody SiteOffer _siteOffer){
		SiteOffer siteOffer = null;
		try {
			siteOffer = _siteofferService.AddUpdate(_siteOffer);
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		return new ResponseEntity<SiteOffer>(siteOffer,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{siteofferId}")
	public ResponseEntity<SiteOffer> Delete(@PathVariable(name="siteofferId") int siteofferId){
		SiteOffer siteOffer = null;
		try {
			siteOffer = _siteofferService.Delete(siteofferId);
		}
		catch(Exception ex) {
			ex.getMessage(); 
		}
		return new ResponseEntity<SiteOffer>(siteOffer,HttpStatus.OK);
	}
	
	@GetMapping("/getbysiteid/{siteId}")
	public ResponseEntity<List<SiteOffer>> GetBySiteId(@PathVariable(name="siteId") int siteId){
		List<SiteOffer> siteOffers = null;
		try {
			siteOffers = _siteofferService.GetBySiteId(siteId);
		}
		catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<SiteOffer>>(siteOffers,HttpStatus.OK);
	}
	@GetMapping("/getbyofferid/{offerId}")
	public ResponseEntity<List<SiteOffer>> GetByOfferId(@PathVariable(name="offerId") int offerId){
		List<SiteOffer> siteOffers = null;
		try {
			siteOffers = _siteofferService.GetByOfferId(offerId);
		}
		catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<SiteOffer>>(siteOffers,HttpStatus.OK);
	}
}
