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

import com.ameotech.services.inventoryservice.entity.ItemDetail;
import com.ameotech.services.inventoryservice.service.ItemDetailService;

@RestController
@RequestMapping("/api/itemdetails")
public class ItemDetailController {

	@Autowired
	private ItemDetailService _itemDetailService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<ItemDetail>> getall(){
		List<ItemDetail> itemDetails =null;
		try {
			itemDetails = _itemDetailService.GetAll();
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<ItemDetail>>(itemDetails, HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{itemdetailId}")
	public ResponseEntity<ItemDetail> GetById(@PathVariable(name="itemdetailId") int itemdetailId){
		ItemDetail itemDetails =null;
		try {
			itemDetails = _itemDetailService.GetById(itemdetailId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<ItemDetail>(itemDetails, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<ItemDetail> AddUpdate(@RequestBody ItemDetail _itemdetails){
		ItemDetail itemDetails =null;
		try {
			itemDetails = _itemDetailService.AddUpdate(_itemdetails);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<ItemDetail>(itemDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete//{itemdetailId}")
	public ResponseEntity<ItemDetail> Delete(@PathVariable int itemdetailId){
		ItemDetail itemDetails =null;
		try {
			itemDetails = _itemDetailService.Delete(itemdetailId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<ItemDetail>(itemDetails, HttpStatus.OK);
	}
}
