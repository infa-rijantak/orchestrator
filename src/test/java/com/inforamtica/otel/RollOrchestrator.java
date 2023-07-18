package com.inforamtica.otel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class RollOrchestrator{
    private static final Logger logger = LoggerFactory.getLogger(RollOrchestrator.class);

    @GetMapping("/newturn")
    public String index() {
        logger.info("Srssdsd");
        List<String> players = new ArrayList<>();
        players.add("Raj");
        players.add("Anand");
        players.add("Michel");

        String url = "http://localhost:8080/rolldice?player=" + players.get(getRandomNumber(0,2));
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    public int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}

