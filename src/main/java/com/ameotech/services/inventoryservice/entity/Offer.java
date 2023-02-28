package com.ameotech.services.inventoryservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbloffer")
public class Offer extends BaseModel {

	@Column(name = "date_active_from")
	private LocalDate dateActiveFrom;

	@Column(name = "time_active_from")
	private LocalDate timeActiveFrom;

	@Column(name = "date_active_to")
	private LocalDate dateActiveTo;

	@Column(name = "time_active_to")
	private LocalDate timeActiveTo;

	@Column(name = "offer_price")
	private double offerPrice;	

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offer(long id,LocalDate dateActiveFrom, LocalDate timeActiveFrom, LocalDate dateActiveTo, LocalDate timeActiveTo,
			double offerPrice) {
		super();
		this.id = id;
		this.dateActiveFrom = dateActiveFrom;
		this.timeActiveFrom = timeActiveFrom;
		this.dateActiveTo = dateActiveTo;
		this.timeActiveTo = timeActiveTo;
		this.offerPrice = offerPrice;
	}

	public LocalDate getDateActiveFrom() {
		return dateActiveFrom;
	}

	public void setDateActiveFrom(LocalDate dateActiveFrom) {
		this.dateActiveFrom = dateActiveFrom;
	}

	public LocalDate getTimeActiveFrom() {
		return timeActiveFrom;
	}

	public void setTimeActiveFrom(LocalDate timeActiveFrom) {
		this.timeActiveFrom = timeActiveFrom;
	}

	public LocalDate getDateActiveTo() {
		return dateActiveTo;
	}

	public void setDateActiveTo(LocalDate dateActiveTo) {
		this.dateActiveTo = dateActiveTo;
	}

	public LocalDate getTimeActiveTo() {
		return timeActiveTo;
	}

	public void setTimeActiveTo(LocalDate timeActiveTo) {
		this.timeActiveTo = timeActiveTo;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}
	@Override
	public String toString() {
		return "Offer [offerId=" + id + "dateActiveFrom=" + dateActiveFrom + ", timeActiveFrom=" + timeActiveFrom
				+ ", dateActiveTo=" + dateActiveTo + ", timeActiveTo=" + timeActiveTo + ", offerPrice=" + offerPrice
				+ ", tenantCode=" + tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime
				+ ", deleted=" + deleted + "]";
	}

}
