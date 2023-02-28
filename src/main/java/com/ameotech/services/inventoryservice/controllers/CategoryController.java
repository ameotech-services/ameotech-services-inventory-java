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

import com.ameotech.services.inventoryservice.entity.category;
import com.ameotech.services.inventoryservice.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService _catService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<category>> GetAll(){
		List<category> _category = null;
		try {
			_category = _catService.GetAll();
		}
		catch(Exception ex) {
			 ex.getMessage();
		}
		return new ResponseEntity<List<category>>(_category, HttpStatus.OK);
	}
	
	@GetMapping("/getbyCategoryId/{categoryId}")
	public ResponseEntity<category> getbyid(@PathVariable("categoryId")int categoryId){
		category _category = null;
		try {
			_category = _catService.GetById(categoryId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<category>(_category,HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<category> addUpdate(@RequestBody category _categoryobj){
		category _category = null;
		try {
			_category = _catService.AddUpdate(_categoryobj);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<category>(_category,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecategory/{categoryId}")
	public ResponseEntity<category> deleteCategory(@PathVariable("categoryId") int categoryId){
		category _category = null;
		try {
			_category = _catService.Delete(categoryId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<category>(_category,HttpStatus.OK);
	}
	
}

