package com.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootmvc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	
	

}
