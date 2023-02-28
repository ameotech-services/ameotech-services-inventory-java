  package com.ameotech.services.inventoryservice.entity;
import ameotech.services.common.models.*;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="tblcategory")
public class category extends BaseModel{
	
	@Column(name="category_name")
	private String categoryName;

	public category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	

	public category(long id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		
	}
	
	@Override
	public String toString() {
		return "category [categoryId=" + id + ", categoryName=" + categoryName + ", tenantCode=" + tenantCode
				+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}
}
