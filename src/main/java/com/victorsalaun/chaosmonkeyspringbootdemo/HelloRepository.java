package com.victorsalaun.chaosmonkeyspringbootdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    private static final Logger logger = LogManager.getLogger(HelloRepository.class);

    public void dummyCall() {
        logger.info("dummyCall");
    }

}