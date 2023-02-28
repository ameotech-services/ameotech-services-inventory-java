package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblcustomer")
public class Customer extends BaseModel {

	@Column(name = "customer_first_name")
	private String customerFirstName;

	@Column(name = "customer_last_name")
	private String customerLastName;

	@Column(name = "customer_middle_name")
	private String customerMiddleName;

	@Column(name = "customer_email")
	private String customerEmail;

	@Column(name = "customer_phone_number")
	private String customerPhoneNumber;

	@Column(name = "customer_landline")
	private String customerLandline;

	@Column(name = "profile_image")
	private String profileImage;

	@Column(name = "customer_username")
	private String customerUsername;

	@Column(name = "customer_password")
	private String customerPassword;

	@Column(name = "account_status")
	private int accountStatus;

	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long id, String customerFirstName, String customerLastName, String customerMiddleName,
			String customerEmail, String customerPhoneNumber, String customerLandline, String profileImage,
			String customerUsername, String customerPassword, int accountStatus) {
		super();
		this.id = id;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerMiddleName = customerMiddleName;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerLandline = customerLandline;
		this.profileImage = profileImage;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.accountStatus = accountStatus;	
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerMiddleName() {
		return customerMiddleName;
	}

	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerLandline() {
		return customerLandline;
	}

	public void setCustomerLandline(String customerLandline) {
		this.customerLandline = customerLandline;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	

	@Override
	public String toString() {
		return "Customer [customerId=" + id + "customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerMiddleName=" + customerMiddleName + ", customerEmail=" + customerEmail
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerLandline=" + customerLandline
				+ ", profileImage=" + profileImage + ", customerUsername=" + customerUsername + ", customerPassword="
				+ customerPassword + ", accountStatus=" + accountStatus + ", tenantCode=" + tenantCode
				+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}

}
