package com.leonardojcv.hrgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class HrGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrGatewayApplication.class, args);
	}	
}
