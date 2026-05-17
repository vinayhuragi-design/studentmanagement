package com.vinay.studentmanagement.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.vinay.studentmanagement.model.Users;
import com.vinay.studentmanagement.repository.UsersRepository;

@Configuration
public class DataInitializer {
	
	@Bean
	CommandLineRunner loadSampleData(UsersRepository usersRepository,PasswordEncoder PasswordEncoder) {
		
		
		return args ->{
			if(!usersRepository.existsByUsername("Vinay")) {
			Users users =new Users();
			users.setUsername("Vinay");
			users.setPassword(PasswordEncoder.encode("Vinayak@9982"));
			users.setActive(true);
			usersRepository.save(users);
			
			}
			
		};
	}
	

}
