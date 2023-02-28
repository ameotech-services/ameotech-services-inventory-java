package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblsiteinfo")
public class SiteInfo extends BaseModel{

	@Column(name="site_name")
	private String siteName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="contact_info")
	private String contactInfo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="user_id")
	private int userId ;
	
	public SiteInfo() {
		super();
		// TODO Auto-generated constructor stub
	} 
	public SiteInfo(long id, String siteName, String description, String contactInfo, String address, int userId) {
		super();
		this.id= id;
		this.siteName = siteName;
		this.description = description;
		this.contactInfo = contactInfo;
		this.address = address;
		this.userId = userId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	} 
	
	@Override
	public String toString() {
		return "SiteInfo [SiteInfoId="+id+"siteName=" + siteName + ", description=" + description + ", contactInfo=" + contactInfo
				+ ", address=" + address + ", userId=" + userId + ", tenantCode=" + tenantCode + ", createdDate="
				+ createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}
	
	
	
}
