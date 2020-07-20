package com.group.kaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class KakaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakaConfigServerApplication.class, args);
	}

}
