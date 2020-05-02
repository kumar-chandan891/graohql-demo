package com.witchers.medium.controller;

import com.witchers.medium.entities.BookEntity;
import com.witchers.medium.repository.BookRepository;
import com.witchers.medium.service.GraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    GraphQLService graphQLService;

    @GetMapping("/books")
    public List<BookEntity> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/graph")
    public ResponseEntity<Object> getRequiredBookDetails(@RequestBody String query){
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
