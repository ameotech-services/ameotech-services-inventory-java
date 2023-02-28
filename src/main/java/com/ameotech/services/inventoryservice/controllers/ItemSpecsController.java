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

import com.ameotech.services.inventoryservice.entity.ItemSpecs;
import com.ameotech.services.inventoryservice.service.ItemSpecsService;

@RestController
@RequestMapping("/api/itemspecs")
public class ItemSpecsController {
	@Autowired
	private ItemSpecsService _itemSpecsService;

	@GetMapping("/getall")
	public ResponseEntity<List<ItemSpecs>> GetAll() {
		List<ItemSpecs> itemspecs = null;

		try {
			itemspecs = _itemSpecsService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<ItemSpecs>>(itemspecs, HttpStatus.OK);
	}

	@GetMapping("/getbyid/{itemspecsId}")
	public ResponseEntity<ItemSpecs> GetById(@PathVariable(name = "itemspecsId") int itemspecsId) {
		ItemSpecs itemSpecs = null;
		try {
			itemSpecs = _itemSpecsService.GetById(itemspecsId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<ItemSpecs>(itemSpecs, HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{itemId}")
	public ResponseEntity<ItemSpecs> GetByItemId(@PathVariable(name = "itemId") int itemId) {
		ItemSpecs itemSpecs = null;
		try {
			itemSpecs = _itemSpecsService.FindByItemId(itemId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<ItemSpecs>(itemSpecs, HttpStatus.OK);
	}

	@PostMapping("/addupdate")
	public ResponseEntity<ItemSpecs> AddUpdate(@RequestBody ItemSpecs _itemspecs) {
		ItemSpecs itemSpecs = null;
		try {
			itemSpecs = _itemSpecsService.AddUpdate(_itemspecs);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<ItemSpecs>(itemSpecs, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{itemspecsId}")
	public ResponseEntity<ItemSpecs> Delete(@PathVariable(name = "itemspecsId") int itemspecsId) {
		ItemSpecs itemSpecs = null;
		try {
			itemSpecs = _itemSpecsService.Delete(itemspecsId );
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<ItemSpecs>(itemSpecs, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletebyitemid/{itemId}")
	public ResponseEntity<ItemSpecs> DeleteByItemId(@PathVariable(name = "itemId") int itemId) {
		ItemSpecs itemSpecs = null;
		try {
			itemSpecs = _itemSpecsService.DeleteByItemId(itemId );
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<ItemSpecs>(itemSpecs, HttpStatus.OK);
	}
}
