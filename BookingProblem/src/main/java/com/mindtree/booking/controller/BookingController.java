package com.mindtree.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.booking.entity.BookingEntity;
import com.mindtree.booking.entity.UserEntity;
import com.mindtree.booking.service.BookingService;

@Controller
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@RequestMapping("/")
	private String loadMenu() {
		return "menu";
	}

	@RequestMapping("/user")
	private String loadUser() {
		return "user";
	}

	@RequestMapping(value="/userToDb",method = RequestMethod.POST)
	private String userToDb(@ModelAttribute UserEntity user, Model model) {
		user = bookingService.userRegister(user);
		model.addAttribute("user", user);
		return "menu";
	}

	@RequestMapping("/bookingLoad")
	public String loadBooking(Model model) {
		List<UserEntity> users = bookingService.getAllUsers();
		model.addAttribute("users", users);
		return "booking";
	}

	@RequestMapping("/booking")
	public String bookingToDb(@ModelAttribute BookingEntity booking, @RequestParam int userId,Model model) {
		booking = bookingService.madeBooking(booking,userId);
		model.addAttribute("booking", booking);
		return "booking";
	}
	
}
