package com.Srvnn.RandomQuotesGenerator.controller;

import com.Srvnn.RandomQuotesGenerator.model.Quote;
import com.Srvnn.RandomQuotesGenerator.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuotesController {

    @Autowired
    QuotesService quotesService;

    @PostMapping("/quote")
    public String addQuote(@RequestBody Quote quote) {
        return quotesService.addQuote(quote);
    }

    @PostMapping("/quotes")
    public String addQuotes(@RequestBody List<Quote> quotes) {
        return quotesService.addQuotes(quotes);
    }

    @GetMapping("/quote")
    public Quote getQuote() {
        return quotesService.getQuote();
    }

    @GetMapping("/quote/{quoteId}")
    public Quote getQuoteBYId(@PathVariable Integer quoteId) {
        return quotesService.getQuoteById(quoteId);
    }

    @GetMapping("/quotes")
    public List<Quote> getQuotesByAuthor(@RequestParam String authorName) {
        return quotesService.getQuotesByAuthor(authorName);
    }

    @PutMapping("/quote/Id/{quoteId}")
    public String updateQuote(@PathVariable Integer quoteId, @RequestBody Quote quote) {
        return quotesService.updateQuote(quoteId, quote);
    }

    @DeleteMapping("/quote/Id/{quoteId}")
    public String deleteQuote(@PathVariable Integer quoteId) {
        return quotesService.deleteQuote(quoteId);
    }
}
