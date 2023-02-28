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

import com.ameotech.services.inventoryservice.entity.MenuType;
import com.ameotech.services.inventoryservice.service.MenuTypeService;

@RestController
@RequestMapping("/api/menutype")
public class MenuTypeController {
	@Autowired
	private MenuTypeService _menutypeService;

	@GetMapping("/getall")
	public ResponseEntity<List<MenuType>> GetAll() {
		List<MenuType> menuTypes = null;

		try {
			menuTypes = _menutypeService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<MenuType>>(menuTypes, HttpStatus.OK);
	}

	@GetMapping("/menutypebyId/{menutypeId}")
	public ResponseEntity<MenuType> getById(@PathVariable("menutypeId") int menutypeId) {
		MenuType menutype = null;
		try {
			menutype = _menutypeService.GetById(menutypeId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<MenuType>(menutype, HttpStatus.OK);
	}

	@PostMapping("/addupdate")
	public ResponseEntity<MenuType> AddUpdate(@RequestBody MenuType _menutype) {
		MenuType menutype = null;
		try {
			menutype = _menutypeService.AddUpdate(_menutype);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<MenuType>(menutype, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{menutypeId}")
	public ResponseEntity<MenuType> Delete(@PathVariable("menutypeId") int menutypeId){
		MenuType menutype = null;
		try {
			menutype = _menutypeService.Delete(menutypeId);
		}
		catch(Exception ex) {
			 ex.getMessage();
		}
		return new ResponseEntity<MenuType>(menutype, HttpStatus.OK);
	}

}
