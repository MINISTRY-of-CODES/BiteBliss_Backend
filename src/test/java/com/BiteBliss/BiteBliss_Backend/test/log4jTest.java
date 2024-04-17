package com.BiteBliss.BiteBliss_Backend.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class log4jTest {
    private static final Logger logger = LogManager.getLogger(log4jTest.class);

    public static void main(String[] args){

			logger.debug(" debug level ");
			logger.info(" info level ");
			logger.warn(" warn level ");
			logger.error(" error level ");
			logger.info("dwdad");
    }
}
