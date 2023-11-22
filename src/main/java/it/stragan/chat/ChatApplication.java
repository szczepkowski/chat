package it.stragan.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		System.setProperty("aws.region", "eu-west-1");
		SpringApplication.run(ChatApplication.class, args);
	}

}
