package com.victorsalaun.chaosmonkeyspringbootdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger logger = LogManager.getLogger(HelloService.class);

    public String returnHello() {
        logger.info("returnHello");
        return "Greetings from Spring Boot!";
    }
}
