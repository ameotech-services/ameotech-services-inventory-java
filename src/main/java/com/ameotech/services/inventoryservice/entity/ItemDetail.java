package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblitem_details")
public class ItemDetail extends BaseModel{

	@Column(name="category_id")
	public int categoryId;
	
	@Column(name="item_id")
	public int itemId;
	
	@Column(name="subcategory_id")
	public int subcategoryId;
	
	@Column(name="description")
	public String description;
	
	@Column(name="ingredients")
	public String ingredients;
	
	@Column(name="recipe")
	public String recipe;
	
	@Column(name="price")
	public long price;
	
	@Column(name="active")
	public Boolean active;

	public ItemDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Long id, String tenantCode, LocalDate createdDate, LocalDate updatedTime, int deleted,
			int categoryId, int itemId, int subcategoryId, String description, String ingredients, String recipe,
			long price, Boolean active) {
		super(id, tenantCode, createdDate, updatedTime, deleted);
		this.categoryId = categoryId;
		this.itemId = itemId;
		this.subcategoryId = subcategoryId;
		this.description = description;
		this.ingredients = ingredients;
		this.recipe = recipe;
		this.price = price;
		this.active = active;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "ItemDetail [categoryId=" + categoryId + ", itemId=" + itemId + ", subcategoryId=" + subcategoryId
				+ ", description=" + description + ", ingredients=" + ingredients + ", recipe=" + recipe + ", price="
				+ price + ", active=" + active + ", id=" + id + ", tenantCode=" + tenantCode + ", createdDate="
				+ createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}
	
	
}
