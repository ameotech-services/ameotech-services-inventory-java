package com.ameotech.services.inventoryservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameotech.services.inventoryservice.entity.Offer;
import com.ameotech.services.inventoryservice.service.OfferService;

@RestController
@RequestMapping("/api/offer")
public class OfferController {
	@Autowired
	private OfferService _offerService;

	@GetMapping("/getall")
	public ResponseEntity<List<Offer>> GetAll() {
		List<Offer> offers = null;
		try {
			offers = _offerService.GetAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<List<Offer>>(offers, HttpStatus.OK);
	}

	@GetMapping("/getbyid/{offerId}")
	public ResponseEntity<Offer> GetById(@PathVariable(name = "offerId") int offerId) {
		Offer offer = null;
		try {
			offer = _offerService.GetById(offerId);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Offer>(offer,HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<Offer> AddUpdate(@RequestBody Offer _offer){
		Offer offer = null;
		try {
			offer = _offerService.AddUpdate(_offer);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Offer>(offer,HttpStatus.OK);
	}
	@PostMapping("/delete/{offerId}")
	public ResponseEntity<Offer> Delete(@PathVariable(name = "offerId") int offerId){
		Offer offer = null;
		try {
			offer = _offerService.Delete(offerId);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<Offer>(offer,HttpStatus.OK);
	}
}
