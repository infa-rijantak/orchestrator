package com.inforamtica.otel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class Utility {

    private static final Logger logger = LoggerFactory.getLogger(Utility.class);

    public int getRandomNumber(int min, int max){
        int randomNum =ThreadLocalRandom.current().nextInt(min, max + 1);
        logger.info("Generated random number : " + randomNum);
        if(true) {
            throw new RuntimeException("Erroooooo");
        }
        return randomNum;
    }
}
