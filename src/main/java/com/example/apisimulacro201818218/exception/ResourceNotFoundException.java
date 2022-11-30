package com.example.apisimulacro201818218.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super();
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
