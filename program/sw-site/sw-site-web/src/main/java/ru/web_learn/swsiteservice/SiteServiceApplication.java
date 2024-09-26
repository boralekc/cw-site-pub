package ru.web_learn.swsiteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SiteServiceApplication {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SiteServiceApplication.class);

        app.run(args);
    }


}
