package com.example.demo.Services;

import java.util.Arrays;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Services.UserService;
import com.example.demo.Web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	private final UserRepo userRepository;

	@Autowired
	public UserServiceImpl(UserRepo userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(
				registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword()
		);
		return userRepository.save(user);
	}

	@Override
	public User loadUserByUsername(String username) {
		return userRepository.findByEmail(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}

