package com.codingexercise.model;

import java.io.Serializable;

/**
 * Created by jenksy on 7/7/17.
 * name
 * address
 * credit limit
 */
public class AdvertiserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String contactName;
    private Integer creditLimit = null;
    private String errorMessage = "OK";//default to ok


    public AdvertiserModel() {
    }

    public AdvertiserModel(String message) {
        this.errorMessage = message;
    }

    public AdvertiserModel(String name, String contactName, int creditLimit) {
        this.name = name;
        this.contactName = contactName;
        this.creditLimit = creditLimit;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
