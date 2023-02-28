package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblitem")
public class Item extends BaseModel {
	@Column(name = "item_name")
	public String itemName;

	@Column(name = "item_type_id")
	public int itemTypeId;

	@Column(name = "item_image")
	public String itemImage;

	@Column(name = "item_status")
	public int itemStatus;

	@Column(name = "threshold")
	public int threshold;

	@Column(name = "menu_id")
	public int menuId;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Long id, String tenantCode, LocalDate createdDate, LocalDate updatedTime, int deleted, String itemName,
			int itemTypeId, String itemImage, int itemStatus, int threshold, int menuId) {
		super(id, tenantCode, createdDate, updatedTime, deleted);
		this.itemName = itemName;
		this.itemTypeId = itemTypeId;
		this.itemImage = itemImage;
		this.itemStatus = itemStatus;
		this.threshold = threshold;
		this.menuId = menuId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemTypeId() {
		return itemTypeId;
	}

	public void setItemTypeId(int itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public int getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(int itemStatus) {
		this.itemStatus = itemStatus;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemTypeId=" + itemTypeId + ", itemImage=" + itemImage
				+ ", itemStatus=" + itemStatus + ", threshold=" + threshold + ", menuId=" + menuId + ", id=" + id
				+ ", tenantCode=" + tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime
				+ ", deleted=" + deleted + "]";
	}

		
	

}
