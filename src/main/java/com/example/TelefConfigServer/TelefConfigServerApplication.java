package com.example.TelefConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TelefConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelefConfigServerApplication.class, args);
	}

}
