package com.prowings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServiceDiscoveryApplication.class, args);
	}

}
