package com.quoteservice.quote.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.quoteservice.quote.model.*;

@Service
public interface QuoteService extends CrudRepository<Quote, Long>{
	Random random = new Random();
	
	public default Quote randomQuote() {
		ArrayList<Quote> quotes = new ArrayList<Quote>();
		for (Quote q: this.findAll()) {
			quotes.add(q);
		}
		Quote q = quotes.get(random.nextInt(quotes.size()));
		return q;
	};
	public List<Quote> findQuotesByAuthorId(Long id);
	public Quote findById(Long id);	
}
