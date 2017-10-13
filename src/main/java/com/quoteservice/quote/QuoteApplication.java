package com.quoteservice.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.quoteservice.quote.QuoteData;

@EnableDiscoveryClient
@SpringBootApplication
public class QuoteApplication {
	
	@Autowired
	private QuoteData quoteData;

	public static void main(String[] args) {
		SpringApplication.run(QuoteApplication.class, args);
	}
}
