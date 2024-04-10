package com.BiteBliss.BiteBliss_Backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.BiteBliss.BiteBliss_Backend.service.FavoriteService;

@SpringBootTest
class BiteBlissBackendApplicationTests {

	@Autowired
	private FavoriteService favoriteService;

	@Test
	void contextLoads() {
	}

	@Test
	void test() {

		System.out.println("test");
	}
}
