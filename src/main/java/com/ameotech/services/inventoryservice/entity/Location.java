package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tbllocation")
public class Location extends BaseModel{
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="latitude")
	private String latitude;
	
	

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(long id,int customerId, String longitude, String latitude) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.longitude = longitude;
		this.latitude = latitude;
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	@Override
	public String toString() {
		return "Location [ locationId="+id+"customerId=" + customerId + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", tenantCode=" + tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime
				+ ", deleted=" + deleted + "]";
	}
	
	
}
