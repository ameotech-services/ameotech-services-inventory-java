package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblmenu")
public class Menu extends BaseModel {

	@Column(name = "menu_name")
	private String menuName;

	@Column(name = "menu_image")
	private String menuImage;

	@Column(name = "menu_status")
	private String menuStatus;

	@Column(name = "menu_type_id")
	private int menuTypeId;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Menu(long id, String menuName, String menuImage, String menuStatus, int menuTypeId) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.menuImage = menuImage;
		this.menuStatus = menuStatus;
		this.menuTypeId = menuTypeId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuImage() {
		return menuImage;
	}

	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}

	public String getMenuStatus() {
		return menuStatus;
	}

	public void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
	}

	public int getMenuTypeId() {
		return menuTypeId;
	}

	public void setMenuTypeId(int menuTypeId) {
		this.menuTypeId = menuTypeId;
	}

	
	@Override
	public String toString() {
		return "Menu [menuId=" + id + "menuName=" + menuName + ", menuImage=" + menuImage + ", menuStatus=" + menuStatus
				+ ", menuTypeId=" + menuTypeId + ", tenantCode=" + tenantCode + ", createdDate=" + createdDate
				+ ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}

}
