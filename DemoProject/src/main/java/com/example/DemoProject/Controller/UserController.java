package com.example.DemoProject.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.DemoProject.Entity.User;
import com.example.DemoProject.Service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable long userId){
		return new ResponseEntity<User>(userService.getUserByID(userId), HttpStatus.OK);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long userId){
		return new ResponseEntity<User>(userService.updateUser(user,userId), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteUser(@PathVariable Long userId){
		userService.deleteUser(userId);
		return new ResponseEntity<Object>(Map.of("message","User Deleted Succesfully"),HttpStatus.OK);
	}
}
