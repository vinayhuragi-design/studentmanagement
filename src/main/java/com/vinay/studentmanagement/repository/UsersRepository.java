package com.vinay.studentmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.studentmanagement.model.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {

	
	boolean existsByUsername(String username);
	
	Optional<Users> findByUsername(String username);
	
	
}
