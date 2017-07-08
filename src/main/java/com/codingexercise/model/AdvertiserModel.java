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
    private int creditLimit;


    public AdvertiserModel() {
    }

    public AdvertiserModel(String name, String contactName, int creditLimit) {
        this.name = name;
        this.contactName = contactName;
        this.creditLimit = creditLimit;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AdvertiserModel{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", contactName='").append(contactName).append('\'');
        sb.append(", creditLimit=").append(creditLimit);
        sb.append('}');
        return sb.toString();
    }
}
