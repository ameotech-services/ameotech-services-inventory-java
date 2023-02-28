package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="tblitem_specs")
@Entity
public class ItemSpecs extends BaseModel{
@Column(name="item_id")
public int itemId;
@Column (name="specs")
public String specs;
public ItemSpecs() {
	super();
	// TODO Auto-generated constructor stub
}

public ItemSpecs(Long id, String tenantCode, LocalDate createdDate, LocalDate updatedTime, int deleted, int itemId,
		String specs) {
	super(id, tenantCode, createdDate, updatedTime, deleted);
	this.itemId = itemId;
	this.specs = specs;
}

public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getSpecs() {
	return specs;
}
public void setSpecs(String specs) {
	this.specs = specs;
}

@Override
public String toString() {
	return "ItemSpecs [itemId=" + itemId + ", specs=" + specs + ", itemdetailId=" + id + ", tenantCode=" + tenantCode
			+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
}


}
