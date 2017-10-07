package com.quoteservice.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.quoteservice.quote.model.Quote;
import com.quoteservice.quote.service.QuoteService;;

@RestController
public class QuoteController {
	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping(value = "/api/random")
	public Quote random() {
		return quoteService.randomQuote();
	}
	
	@RequestMapping(value = "/api/saveQuote", method = RequestMethod.POST)
	public void saveQuote(@RequestBody Quote quote) {
		quoteService.save(quote);
	}
	
	@RequestMapping(value = "/api/quoteById", method = RequestMethod.GET)
	public Quote getQuoteById(@RequestParam(value="id")  Long id) {
		Quote q = quoteService.findById(id);
		return q;
	}
	
	@RequestMapping(value = "/api/quoteByAuthorId", method = RequestMethod.GET)
	public List<Quote> getQuoteByAuthorId(@RequestParam(value="authorId")  Long authorId) {
		List<Quote> quotes= quoteService.findQuotesByAuthorId(authorId);
		return quotes;
	}
}
