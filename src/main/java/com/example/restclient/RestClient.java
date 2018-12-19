package com.example.restclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Person;
import com.example.demo.Restclient2Application;

@Component
public class RestClient implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(Restclient2Application.class);
	@Autowired
	RestTemplate restTemplate;
	
	private void getDatafromRestWebService() {
		System.out.println("Calling...........");
		Person person = restTemplate.getForObject(
				"http://localhost:8080/persons/1",Person.class);
		log.info(person.toString());
	}
	

	@Override
	public void run(String... args) throws Exception {
		getDatafromRestWebService();
	}

}
