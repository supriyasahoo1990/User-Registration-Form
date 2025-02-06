package com.registration.SpringBoot_RegistrationForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.SpringBoot_RegistrationForm.entity.User;
import com.registration.SpringBoot_RegistrationForm.repository.UserRepo;
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
	private UserRepo repo;
    
	@Override
	public void registerUser(User user) {
		repo.save(user);
		
	}

}
