package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblmenu_type")
public class MenuType extends BaseModel {

	@Column(name = "type_name")
	private String typeName;

	@Column(name = "description")
	private String description;

	public MenuType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuType(long id,String typeName, String description) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.description = description;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "MenuType [menuTypeId=" + id + "typeName=" + typeName + ", description=" + description + ", tenantCode="
				+ tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted
				+ "]";
	}

}
