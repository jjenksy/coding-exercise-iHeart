package com.codingexercise.model;

import java.io.Serializable;

/**
 * Created by jenksy on 7/9/17.
 * Message class is used to send messages to the user about api information
 */
public class Message implements Serializable {

    private String message = "OK";

    public Message(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
