package com.codingexercise.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/9/17.
 */
public class MessageTest {

    Message message;

    @Before
    public void init(){
        this.message = new Message("Hello");
    }
    @Test
    public void getSetMessage() throws Exception {
        assertEquals(this.message.getMessage(),"Hello");
        this.message.setMessage("GoodBye");
        assertEquals(this.message.getMessage(),"GoodBye");
    }



    @Test
    public void equals() throws Exception {
        assertTrue(this.message.equals(new Message("Hello")));
    }

    @Test
    public void testHashCode() throws Exception {
        assertNotNull(this.message.hashCode());
    }

    @Test
    public void testCanEqual() throws Exception {
       assertTrue(this.message.canEqual(new Message("Hello")));
    }

    @Test
    public void testToString() throws Exception {
        assertNotNull(this.message.toString());
    }

}