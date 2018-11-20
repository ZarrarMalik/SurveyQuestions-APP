package com.myself.zarrar.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository repository;

	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new User("Zarrar","Admin"));
		repository.save(new User("Kathryn","Secretary"));
		repository.save(new User("Ed","User"));
		repository.save(new User("Jenny","User"));
	}
	

}
