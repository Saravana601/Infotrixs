package com.Srvnn.RandomQuotesGenerator.service;

import com.Srvnn.RandomQuotesGenerator.model.Quote;
import com.Srvnn.RandomQuotesGenerator.repository.IQuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuotesService {

    @Autowired
    IQuotesRepository quotesRepository;

    @Autowired
    Random random;

    public String addQuote(Quote quote) {
        quotesRepository.save(quote);
        return "Quote added. Your quote id is " + quote + ". Please remember for future use";
    }

    public String addQuotes(List<Quote> quotes) {
        quotesRepository.saveAll(quotes);
        return "Quotes added";
    }

    public Quote getQuote() {
        List<Quote> quotes = quotesRepository.findAll();

        int randomIndex;
        if(quotes.size() == 1) {
            randomIndex = 0;
        }
        else {
            randomIndex = random.nextInt(quotes.size());
        }
        return quotes.get(randomIndex);
    }

    public List<Quote> getQuotesByAuthor(String authorName) {
        return quotesRepository.findAllByAuthor(authorName);
    }

    public String updateQuote(Integer quoteId, Quote quote) {
        Quote existingQuote = quotesRepository.findById(quoteId).orElseThrow();
        existingQuote.setQuote(quote.getQuote());
        existingQuote.setAuthor(quote.getAuthor());
        quotesRepository.save(existingQuote);
        return "Quote updated successfully";
    }

    public String deleteQuote(Integer quoteId) {
        quotesRepository.deleteById(quoteId);
        return "Quote deleted successfully";
    }

    public Quote getQuoteById(Integer quoteId) {
        return quotesRepository.findById(quoteId).orElseThrow();
    }
}
