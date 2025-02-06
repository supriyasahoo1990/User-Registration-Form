package com.registration.SpringBoot_RegistrationForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.SpringBoot_RegistrationForm.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User,String>{

}
