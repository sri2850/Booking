package com.mindtree.booking.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	private int userAge;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<BookingEntity> booking;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public List<BookingEntity> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingEntity> booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", booking="
				+ booking + "]";
	}

	/**
	 * @param userId
	 * @param userName
	 * @param userAge
	 * @param booking
	 */
	public UserEntity(int userId, String userName, int userAge, List<BookingEntity> booking) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.booking = booking;
	}

	/**
	 * 
	 */
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
