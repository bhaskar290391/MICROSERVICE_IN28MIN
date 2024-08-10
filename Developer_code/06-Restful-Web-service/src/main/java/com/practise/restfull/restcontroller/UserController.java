package com.practise.restfull.restcontroller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.practise.restfull.dao.PostRepository;
import com.practise.restfull.dao.UserRepository;
import com.practise.restfull.exception.UserNotFoundException;
import com.practise.restfull.model.Post;
import com.practise.restfull.model.User;

import jakarta.validation.Valid;

@RestController
public class UserController {

	private UserRepository userRepo;

	private PostRepository postRepo;

	public UserController(UserRepository userRepo, PostRepository postRepo) {
		this.userRepo = userRepo;
		this.postRepo = postRepo;
	}

	@PostMapping("/users")
	public ResponseEntity<User> save(@Valid @RequestBody User user) {

		User userData = userRepo.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userData.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

	@GetMapping("/users")
	public List<User> retrieveUsers() {
		return userRepo.findAll();
	}

	@GetMapping("/users/{id}")
	public User userById(@PathVariable("id") int id) {
		Optional<User> data = userRepo.findById(id);

		if (data.isEmpty()) {
			throw new UserNotFoundException("Id" + id);
		}
		return data.get();
	}

	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable("id") int id) {
		userRepo.deleteById(id);
	}
	
	
	
	
	@PostMapping("/users/{userId}/posts")
	public ResponseEntity<Post> save(@PathVariable("userId") int userId,@Valid @RequestBody Post post) {

		Optional<User> data = userRepo.findById(userId);

		if (data.isEmpty()) {
			throw new UserNotFoundException("Id" + userId);
		}
		post.setUser(data.get());

		Post postData = postRepo.save(post);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(postData.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}
	
	
	@GetMapping("/users/{userId}/posts")
	public List<Post> retrievePosts(@PathVariable("userId") int userId) {
		
		Optional<User> data = userRepo.findById(userId);

		if (data.isEmpty()) {
			throw new UserNotFoundException("Id" + userId);
		}
		return data.get().getPosts();
	}
}
