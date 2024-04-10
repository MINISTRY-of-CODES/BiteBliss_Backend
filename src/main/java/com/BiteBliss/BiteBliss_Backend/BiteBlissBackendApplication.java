package com.BiteBliss.BiteBliss_Backend;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;

@SpringBootApplication
public class BiteBlissBackendApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(BiteBlissBackendApplication.class, args);
	}

}
