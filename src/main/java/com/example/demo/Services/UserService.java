package com.example.demo.Services;

import com.example.demo.Model.User;
import com.example.demo.Web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);

	User loadUserByUsername(String username);

	User findByEmail(String email);
}
