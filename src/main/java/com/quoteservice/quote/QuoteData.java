package com.quoteservice.quote;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.quoteservice.quote.model.Quote;
import com.quoteservice.quote.service.QuoteService;

@Configuration
public class QuoteData {

	@Autowired
	private QuoteService quoteService;
	
	@Bean
	public QuoteData getBean() throws SQLException{
		Quote q1 = new Quote("The world is a thing of utter inordinate","wikiquote",1);
		Quote q2 = new Quote("Inner Peace","Unknown",2);
		Quote q3 = new Quote("I think that only daring speculation....", "Wikipedia",2);
		Quote q4 = new Quote("The incredible world", "9Gag",3);
		
		quoteService.save(q1);
		quoteService.save(q2);
		quoteService.save(q3);
		quoteService.save(q4);
		
		return new QuoteData();
	}
	
}

