package com.brito.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brito.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {

		User bito = new User("1", "brito pvp", "britopvp123@gmail.com");
		User tiag = new User("2", "met nebulous", "metnebulous@gmail.com");
		User loius = new User("3", "luizXgeralt", "littlewitcher@gmail.com");

		List<User> users = new ArrayList<>();

		users.addAll(Arrays.asList(bito, tiag, loius));

		return ResponseEntity.ok().body(users);
	}

}
