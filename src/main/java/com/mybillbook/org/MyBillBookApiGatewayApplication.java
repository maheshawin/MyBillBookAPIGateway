package com.mybillbook.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class MyBillBookApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBillBookApiGatewayApplication.class, args);
	}

}
