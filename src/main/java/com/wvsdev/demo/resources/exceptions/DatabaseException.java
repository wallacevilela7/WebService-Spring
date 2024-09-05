package com.wvsdev.demo.resources.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg){
        super(msg);
    }
}