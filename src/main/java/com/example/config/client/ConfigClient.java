package com.example.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClient {

	@Value("${app.say}")
	private String say;

	@GetMapping("/whatsup")
    public String whatsup() {
        return "Hello, I would say: " + say;
    }

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient.class, args);
	}

}
