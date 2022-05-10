package com.vvs.springwebfluxrestexceptionhandler.controller;

import com.vvs.springwebfluxrestexceptionhandler.exception.UnAuthorizedException;
import com.vvs.springwebfluxrestexceptionhandler.model.Book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

// @RestController
@RequestMapping("/api")
public class BookController {
  
  @GetMapping("/book")
  public Mono<ResponseEntity<Book>> getBookById() {
    return Mono.error(new UnAuthorizedException("Access denied"));
  }
}
