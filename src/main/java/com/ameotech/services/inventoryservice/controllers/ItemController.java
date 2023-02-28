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

import com.ameotech.services.inventoryservice.entity.Item;
import com.ameotech.services.inventoryservice.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	@Autowired
	private ItemService _itemService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<Item>> GetAll(){
		List<Item> items = null;
		try {
			items = _itemService.GetAll();
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Item>>(items,HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{itemId}")
	public ResponseEntity<Item> GetById(@PathVariable(name="itemId")int itemId){
		Item items = null;
		try {
			items = _itemService.GetById(itemId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Item>(items,HttpStatus.OK);
	}
	@PostMapping("/addupdate")
	public ResponseEntity<Item> AddUpdate(@RequestBody Item _items){
		Item items = null;
		try {
			items = _itemService.AddUpdate(_items);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Item>(items,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{itemId}")
	public ResponseEntity<Item> Delete(@PathVariable(name="itemId")int itemId){
		Item items = null;
		try {
			items = _itemService.Delete(itemId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Item>(items,HttpStatus.OK);
	}
}
