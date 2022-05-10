package com.vvs.springwebfluxrestexceptionhandler.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.AllArgsConstructor;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;;

@Configuration
@AllArgsConstructor
public class AuthorRouter {

  @Bean
  public RouterFunction<ServerResponse> routerUserAccount(AuthorHandler authorHandler) {
    return route()
        .nest(path("/api"), builder -> builder
          .GET("author", authorHandler::getAuthor)
          .GET("book", authorHandler::getBookById))
        .build();
  }
}
