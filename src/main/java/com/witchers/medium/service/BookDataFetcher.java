package com.witchers.medium.service;

import com.witchers.medium.entities.BookEntity;
import com.witchers.medium.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDataFetcher implements DataFetcher<List<BookEntity>> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookEntity> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return bookRepository.findAll();
    }
}
