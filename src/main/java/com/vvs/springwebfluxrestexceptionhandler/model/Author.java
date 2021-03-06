package com.vvs.springwebfluxrestexceptionhandler.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {
  
  private String id;
  private String firstName;
  private String middleName;
  private String lastName;
}
