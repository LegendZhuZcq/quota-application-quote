package com.quoteservice.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quoteservice.quote.QuoteData;

@SpringBootApplication
public class QuoteApplication {
	
	@Autowired
	private QuoteData quoteData;

	public static void main(String[] args) {
		SpringApplication.run(QuoteApplication.class, args);
	}
}
