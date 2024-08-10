package com.practise.restfull.restcontroller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practise.restfull.dao.UserDao;
import com.practise.restfull.exception.UserNotFoundException;
import com.practise.restfull.model.User;

@RestController
public class UserController {

	private UserDao usersDao;

	public UserController(UserDao usersDao) {
		this.usersDao = usersDao;
	}

	@PostMapping("/users")
	public ResponseEntity<User> save(@RequestBody User user) {

		User userData = usersDao.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userData.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

	@GetMapping("/users")
	public List<User> retrieveUsers() {
		return usersDao.retrieveUsers();
	}

	@GetMapping("/users/{id}")
	public User userById(@PathVariable("id") int id) {
		User data = usersDao.findUserById(id);
		
		if(data == null) {
			throw new  UserNotFoundException("Id" +id);
		}
		return data;
	}

	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable("id") int id) {
		usersDao.deleteById(id);
	}
}
