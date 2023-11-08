package com.Srvnn.RandomQuotesGenerator.repository;

import com.Srvnn.RandomQuotesGenerator.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IQuotesRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findAllByAuthor(String authorName);
}
