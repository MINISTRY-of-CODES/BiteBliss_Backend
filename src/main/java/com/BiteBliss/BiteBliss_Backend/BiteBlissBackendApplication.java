package com.BiteBliss.BiteBliss_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class BiteBlissBackendApplication {
	private static final Logger logger = LogManager.getLogger(BiteBlissBackendApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BiteBlissBackendApplication.class, args);
		logger.debug(" debug level ");
		logger.info(" info level ");
		logger.warn(" warn level ");
		logger.error(" error level ");
		logger.fatal(" fatal level ");
		log.info("ddadaa");
	}

}
