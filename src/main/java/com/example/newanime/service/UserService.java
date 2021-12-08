package com.example.newanime.service;
import com.example.newanime.UserRegistrationDto;
import com.example.newanime.modelo.User;

import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
