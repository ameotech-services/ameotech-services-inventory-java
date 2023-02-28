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

import com.ameotech.services.inventoryservice.entity.Menu;
import com.ameotech.services.inventoryservice.service.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/allmenus")
	public ResponseEntity<List<Menu>> GetAll(){
		List<Menu> menus = null;
		try {
			menus= menuService.GetAll();
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Menu>>(menus,HttpStatus.OK);
	}
	
	@GetMapping("/menubyId/{menuId}")
	public ResponseEntity<Menu> getbyId(@PathVariable("menuId") int menuId){
		Menu _menu = null;
		try {
			_menu = menuService.GetById(menuId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Menu>(_menu, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<Menu> AddUpdate(@RequestBody Menu _menu){
		Menu menu = null;
		try {
			menu= menuService.AddUpdate(_menu);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Menu>(menu, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{menuId}")
	public ResponseEntity<Menu> Delete(@PathVariable("menuId") int menuId){
		Menu menu = null;
		try {
			menu = menuService.Delete(menuId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Menu>(menu, HttpStatus.OK);
	}
	
	@GetMapping("/getbySiteId/{siteId}")
	public ResponseEntity<List<Menu>> getbySiteId(@PathVariable("siteId") int siteId){
		List<Menu> menu = null;
		try {
			menu = menuService.getMenubySiteId(siteId);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Menu>>(menu,HttpStatus.OK);
	}
}
