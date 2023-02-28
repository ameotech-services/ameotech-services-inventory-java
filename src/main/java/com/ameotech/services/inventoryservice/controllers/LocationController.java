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

import com.ameotech.services.inventoryservice.entity.Location;
import com.ameotech.services.inventoryservice.service.LocationService;

@RestController
@RequestMapping("/api/location")
public class LocationController {
@Autowired 
private LocationService _locationService;
@GetMapping("/getall")
public ResponseEntity<List<Location>> GetAll(){
	List<Location> _location = null;
	try {
		_location = _locationService.GetAll();
	}
	catch(Exception ex) {
		 ex.getMessage();
	}
	return new ResponseEntity<List<Location>>(_location, HttpStatus.OK);
}

@GetMapping("/getbyLocationId/{locationId}")
public ResponseEntity<Location> getbyid(@PathVariable("locationId")int locationId){
	Location _location = null;
	try {
		_location = _locationService.GetById(locationId);
	}
	catch(Exception ex) {
		ex.getMessage();
	}
	return new ResponseEntity<Location>(_location,HttpStatus.OK);
}

@PostMapping("/addupdate")
public ResponseEntity<Location> addUpdate(@RequestBody Location _Locationobj){
	Location _location = null;
	try {
		_location = _locationService.AddUpdate(_Locationobj);
	}
	catch(Exception ex) {
		ex.getMessage();
	}
	return new ResponseEntity<Location>(_location,HttpStatus.OK);
}

@DeleteMapping("/deleteLocation/{locationId}")
public ResponseEntity<Location> deleteLocation(@PathVariable("locationId") int locationId){
	Location _location = null;
	try {
		_location = _locationService.Delete(locationId);
	}
	catch(Exception ex) {
		ex.getMessage();
	}
	return new ResponseEntity<Location>(_location,HttpStatus.OK);
}

}
