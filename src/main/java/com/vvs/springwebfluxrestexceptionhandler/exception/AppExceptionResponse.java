package com.vvs.springwebfluxrestexceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppExceptionResponse {
  
  private String code;
  private String message;
  private String timestamp;
}
