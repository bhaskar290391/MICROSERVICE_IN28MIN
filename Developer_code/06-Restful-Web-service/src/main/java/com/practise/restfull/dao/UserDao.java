package com.practise.restfull.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.practise.restfull.model.User;

@Component
public class UserDao {

	private static List<User> users = new ArrayList<>();;
	private static int userCount = 0;

	static {
		users.add(new User(++userCount, "bhaskar", LocalDate.now().minusYears(35)));
		users.add(new User(++userCount, "Maddy", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "kanishk", LocalDate.now().minusYears(15)));
	}

	public List<User> retrieveUsers() {
		return users;
	}

	public User findUserById(int id) {
		return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
	}

	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}

	public void deleteById(int id) {

		Predicate<? super User> user = data -> data.getId().equals(id);
		users.removeIf(user);
	}
}
