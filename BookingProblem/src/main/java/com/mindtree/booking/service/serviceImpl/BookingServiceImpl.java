package com.mindtree.booking.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.booking.entity.BookingEntity;
import com.mindtree.booking.entity.UserEntity;
import com.mindtree.booking.repository.BookingRepository;
import com.mindtree.booking.repository.UserRepository;
import com.mindtree.booking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public UserEntity userRegister(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public BookingEntity madeBooking(BookingEntity booking, int userId) {
		UserEntity user = userRepository.getOne(userId);
		booking.setUser(user);
		int price = 0;
		int discountedPrice = 0;
		if (user.getUserAge() > 30) {
			price = booking.getDistance() * 10;
			System.out.println("prices"+price);
			discountedPrice = price-((price * 5) / 100);
			System.out.println("price"+discountedPrice);
			booking.setPrice(discountedPrice);
		} else if (user.getUserAge() > 50) {
			price = booking.getDistance() * 10;
			discountedPrice = price - ((price * 10) / 100);
			booking.setPrice(discountedPrice);
		} else {
			price = booking.getDistance() * 10;
			booking.setPrice(price);
		}
		return bookingRepository.save(booking);
	}

}
