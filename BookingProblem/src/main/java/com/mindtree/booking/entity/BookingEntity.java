package com.mindtree.booking.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;

	private String fromPlace;

	private String toPlace;

	private Date doj;

	private int distance;

	private String foodPreference;

	private double price;

	private String travellingWith;

	@ManyToOne(fetch = FetchType.LAZY)
	private UserEntity user;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTravellingWith() {
		return travellingWith;
	}

	public void setTravellingWith(String travellingWith) {
		this.travellingWith = travellingWith;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", doj="
				+ doj + ", distance=" + distance + ", foodPreference=" + foodPreference + ", price=" + price
				+ ", travellingWith=" + travellingWith + ", user=" + user + "]";
	}

	public BookingEntity(int bookingId, String fromPlace, String toPlace, Date doj, int distance, String foodPreference,
			double price, String travellingWith, UserEntity user) {
		super();
		this.bookingId = bookingId;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.doj = doj;
		this.distance = distance;
		this.foodPreference = foodPreference;
		this.price = price;
		this.travellingWith = travellingWith;
		this.user = user;
	}

	public BookingEntity() {
		super();
	}

}
