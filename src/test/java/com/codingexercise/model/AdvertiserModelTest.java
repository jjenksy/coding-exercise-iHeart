package com.codingexercise.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/8/17.
 */
@RunWith(SpringRunner.class)
public class AdvertiserModelTest {


    private AdvertiserModel advertiserModel;
    @Before
    public void init(){
       advertiserModel = new AdvertiserModel();
    }

    @Test
    public void setGetName() throws Exception {
        String name = "John";
       advertiserModel.setName(name);
        assertEquals(name, advertiserModel.getName());
    }

    @Test
    public void setGetContactName() throws Exception {
        String name = "John";
       advertiserModel.setContactName(name);
       assertEquals(name, advertiserModel.getContactName());
    }


    @Test
    public void setGetCreditLimit() throws Exception {
        Integer creditLimit = 900;
       advertiserModel.setCreditLimit(creditLimit);
       assertEquals(creditLimit,advertiserModel.getCreditLimit());
    }

    @Test
    public void getSetId() throws Exception {
        advertiserModel.setId(1);
        assertEquals(advertiserModel.getId(),1,0.0);
    }

    @Test
    public void getSetErrorMessage() throws Exception {
        advertiserModel.setErrorMessage("Hello");
        assertEquals(advertiserModel.getErrorMessage(),"Hello");
    }



}