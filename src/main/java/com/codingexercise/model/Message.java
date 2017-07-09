package com.codingexercise.model;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by jenksy on 7/9/17.
 * Message class is used to send messages to the user about api information
 */
@Data
public class Message implements Serializable {

    private String message = "OK";

    public Message(String message) {
        this.message = message;
    }

}
