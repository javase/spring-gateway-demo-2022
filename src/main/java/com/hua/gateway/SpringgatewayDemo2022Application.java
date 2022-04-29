package com.hua.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringgatewayDemo2022Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringgatewayDemo2022Application.class, args);
	}

}
