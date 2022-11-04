package com.example.DemoProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.User;

@Service
public interface UserService {
	//create
	User createUser(User user);
	
	//read
	List<User> getAllUser();
	User getUserByID(Long id);
	
	//update
	User updateUser(User user, Long id);
	
	//delete
	void deleteUser(Long id);
}
