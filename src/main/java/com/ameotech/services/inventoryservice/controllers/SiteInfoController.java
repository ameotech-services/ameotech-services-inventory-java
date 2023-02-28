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

import com.ameotech.services.inventoryservice.entity.SiteInfo;
import com.ameotech.services.inventoryservice.service.SiteInfoService;

@RestController
@RequestMapping("/api/siteinfo")
public class SiteInfoController {
	@Autowired
	private SiteInfoService _siteinfoService;

	@GetMapping("/getall")
	public ResponseEntity<List<SiteInfo>> getAll() {
		List<SiteInfo> siteinfo = null;
		try {
			siteinfo = _siteinfoService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<SiteInfo>>(siteinfo, HttpStatus.OK);
	}
	
	
	@GetMapping("/getbyId/{siteInfoId}")
	public ResponseEntity<SiteInfo> getbyId(@PathVariable int siteInfoId) {
		SiteInfo siteinfo = null;
		try {
			siteinfo = _siteinfoService.GetById(siteInfoId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SiteInfo>(siteinfo, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<SiteInfo> addupdate(@RequestBody SiteInfo _siteInfo){
		SiteInfo siteinfo = null;
		try {
			siteinfo =_siteinfoService.AddUpdate(siteinfo);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SiteInfo>(siteinfo, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{siteInfoId}")
	public ResponseEntity<SiteInfo> Delete(@PathVariable int siteInfoId) {
		SiteInfo siteinfo = null;
		try {
			siteinfo = _siteinfoService.Delete(siteInfoId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<SiteInfo>(siteinfo, HttpStatus.OK);
	}
}
