package com.example.DemoProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoProject.Entity.User;
import com.example.DemoProject.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User getUserByID(Long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User updateUser(User user, Long id) {
		User updatedUser = userRepo.findById(id).get();
		updatedUser = userRepo.save(user);
		return updatedUser;
	}

	@Override
	public void deleteUser(Long id) {
		User user = userRepo.findById(id).get();
		userRepo.delete(user);;
	}
	

}
