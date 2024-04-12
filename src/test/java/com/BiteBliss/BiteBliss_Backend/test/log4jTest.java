package com.BiteBliss.BiteBliss_Backend.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class log4jTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void Log4j2Test(){
        logger.info( "Hello World!" );
        log.error("Damn!");
    }
}
