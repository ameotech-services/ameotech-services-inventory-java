package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblsubcategory")
public class SubCategory extends BaseModel {

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "subcategory_name")
	private String subCategoryName;

	@Column(name = "tenant_code")
	private String tenantCode;
	@Column(name = "create_ts")
	private LocalDate createdDate;
	@Column(name = "last_updated_time")
	private LocalDate UpdatedTime;
	@Column(name = "deleted")
	private int deleted;

	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategory(long id, int categoryId, String subCategoryName, String tenantCode, LocalDate createdDate,
			LocalDate updatedTime, int deleted) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.subCategoryName = subCategoryName;
		this.tenantCode = tenantCode;
		this.createdDate = createdDate;
		UpdatedTime = updatedTime;
		this.deleted = deleted;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getTenantCode() {
		return tenantCode;
	}

	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedTime() {
		return UpdatedTime;
	}

	public void setUpdatedTime(LocalDate updatedTime) {
		UpdatedTime = updatedTime;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + id + "categoryId=" + categoryId + ", subCategoryName=" + subCategoryName
				+ ", tenantCode=" + tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime
				+ ", deleted=" + deleted + "]";
	}

}
