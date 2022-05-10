package com.vvs.springwebfluxrestexceptionhandler.router;

import com.vvs.springwebfluxrestexceptionhandler.exception.UnAuthorizedException;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class AuthorHandler {
  
  public Mono<ServerResponse> getAuthor(ServerRequest request) {
    return Mono.error(new UnAuthorizedException("Access denied."));
  }

  public Mono<ServerResponse> getBookById(ServerRequest request) {
    return Mono.error(new UnAuthorizedException("Access denied."));
  }
}