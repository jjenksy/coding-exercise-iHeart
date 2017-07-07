package com.condingexcercise.advertiser;


/**
 * Created by jenksy on 7/7/17.
 * name
 * address
 * credit limit
 */

public class AdvertiserModel {

    private Integer id;
    private String name;
    private String address;
    private int creditLimit;


    public AdvertiserModel() {
    }

    public AdvertiserModel(String name, String address, int creditLimit) {
        this.name = name;
        this.address = address;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
