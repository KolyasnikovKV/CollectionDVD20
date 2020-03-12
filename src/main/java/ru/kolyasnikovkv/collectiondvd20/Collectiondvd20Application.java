package ru.kolyasnikovkv.collectiondvd20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Collectiondvd20Application {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Collectiondvd20Application.class, args);
	}

}
