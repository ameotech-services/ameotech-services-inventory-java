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

import com.ameotech.services.inventoryservice.entity.SubCategory;
import com.ameotech.services.inventoryservice.service.SubCategoryService;

@RestController
@RequestMapping("/api/subcategory")
public class SubCategoryController {
	@Autowired
	private SubCategoryService _subCategoryService;

	@GetMapping("/getall")
	public ResponseEntity<List<SubCategory>> getAllSubCategories() {
		List<SubCategory> subCategories = null;
		try {
			subCategories = _subCategoryService.getAllSubCategories();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<SubCategory>>(subCategories, HttpStatus.OK);
	}
	
	@GetMapping("/getbyId/{subCategoryId}")
	public ResponseEntity<SubCategory> getById(@PathVariable("subCategoryId") int subCategoryId){
		SubCategory subCategory = null;
		try {
			subCategory = _subCategoryService.getbyId(subCategoryId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SubCategory>(subCategory,HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<SubCategory> addUpdate(@RequestBody SubCategory _subCategory){
		SubCategory subCategory = null;
		try {
			subCategory = _subCategoryService.addorUpdate(_subCategory);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SubCategory>(subCategory,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{subCategoryId}")
	public ResponseEntity<SubCategory>delete(@PathVariable("subCategoryId")int subCategoryId){
		SubCategory subCategory = null;
		try {
			subCategory = _subCategoryService.delete(subCategoryId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SubCategory>(subCategory,HttpStatus.OK);
	}
}
