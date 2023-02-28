package com.ameotech.services.inventoryservice.entity;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblsite_offer")
public class SiteOffer extends BaseModel{
	@Column(name="site_id")
	private int siteId;
	@Column(name="offer_id")
	private int offerId;
	public SiteOffer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SiteOffer(int siteId, int offerId) {
		super();
		this.siteId = siteId;
		this.offerId = offerId;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	@Override
	public String toString() {
		return "SiteOffer [siteId=" + siteId + ", offerId=" + offerId + ", id=" + id + ", tenantCode=" + tenantCode
				+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}
	
	
}
