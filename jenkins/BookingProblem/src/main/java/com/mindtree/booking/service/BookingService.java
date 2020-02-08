package com.mindtree.booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.booking.entity.BookingEntity;
import com.mindtree.booking.entity.UserEntity;

@Service
public interface BookingService {

	public UserEntity userRegister(UserEntity user);

	public List<UserEntity> getAllUsers();

	public BookingEntity madeBooking(BookingEntity booking, int userId);

}
