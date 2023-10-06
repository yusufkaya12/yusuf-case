package com.threepounds.caseproject.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String msg){
      super(msg);
    }
}
