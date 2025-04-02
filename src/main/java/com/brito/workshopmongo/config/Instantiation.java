package com.brito.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.brito.workshopmongo.domain.User;
import com.brito.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User bito = new User(null, "brito pvp", "britopvp123@gmail.com");
		User tiag = new User(null, "met nebulous", "metnebulous@gmail.com");
		User loius = new User(null, "luizXgeralt", "littlewitcher@gmail.com");
		
		userRepository.saveAll(Arrays.asList(bito, tiag, loius));
	}

}
