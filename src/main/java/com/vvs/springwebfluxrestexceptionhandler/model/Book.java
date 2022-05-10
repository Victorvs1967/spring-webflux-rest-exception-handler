package com.vvs.springwebfluxrestexceptionhandler.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Book {
  
  private String id;
  private String title;
  private String author;
  private int page;
  private String isbn;
  private String description;
  private double price;
  private LocalDate publicationDate;
  private String language;
}
