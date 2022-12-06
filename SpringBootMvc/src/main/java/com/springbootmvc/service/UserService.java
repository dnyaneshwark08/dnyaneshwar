package com.springbootmvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmvc.entity.User;
import com.springbootmvc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean registerUser(User user) {
		userRepository.save(user);
		return true;
	}

	public boolean validateUser(User user) {
		Optional<User> optional = userRepository.findById(user.getUserName());
		if (optional.isPresent()) {
			String password = optional.get().getPassword();
			if (user.getPassword().equals(password))
				return true;

		}
		return false;


	}

	public User getUser(String userName) {
		if (this.userRepository.existsById(userName)) {
			Optional<User> optional = this.userRepository.findById(userName);
			if (optional.isPresent()) {
				return optional.get();
			}
		}
		return null;
	}

	public boolean userUpdate(String userName, String email, String contact, String address) {
		User u1 = this.getUser(userName);
		u1.setEmail(email);
		u1.setContact(contact);
		u1.setAddress(address);
		userRepository.save(u1);
		return true;
	}

}
