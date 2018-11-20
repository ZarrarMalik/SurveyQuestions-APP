package com.myself.zarrar.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory
            .getLogger(UserCommandLineRunner.class);
	
	@Autowired
	private UserRepository repository;

	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new User("Zarrar","Admin"));
		repository.save(new User("Kathryn","Secretary"));
		repository.save(new User("Ed","User"));
		repository.save(new User("Jenny","User"));
		
		log.info("-------------------------------");
        log.info("Finding all users");
        log.info("-------------------------------");
		for (User user : repository.findAll()) {
            log.info(user.toString());
            
        }
		log.info("Admin users are.....");
		log.info("____________________");
		for (User user : repository.findByRole("Admin")) {
			log.info(user.toString());
		}
		
		 log.info("-------------------------------");
	        log.info("Finding user with id 1");
	        log.info("-------------------------------");
	        User user = repository.findOne(1L);
	        log.info(user.toString());

		
	}
	

}
