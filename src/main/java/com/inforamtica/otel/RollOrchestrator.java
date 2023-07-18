package com.inforamtica.otel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RollOrchestrator{
    private static final Logger logger = LoggerFactory.getLogger(RollOrchestrator.class);

    @Autowired
    private Utility utility;

    @GetMapping("/newturn")
    public String index() {

        List<String> players = new ArrayList<>();
        players.add("Raj");
        players.add("Anand");
        players.add("Michel");

        String url = "http://localhost:8081/rolldice?player=" + players.get(utility.getRandomNumber(0,2));
        System.out.println("URL : " + url);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}

