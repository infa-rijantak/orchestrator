package com.inforamtica.otel;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OtelOrchestrationApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(OtelOrchestrationApplication.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }

  
}
