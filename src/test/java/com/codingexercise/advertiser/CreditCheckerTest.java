package com.codingexercise.advertiser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/8/17.
 */
@RunWith(SpringRunner.class)
public class CreditCheckerTest {
    @Test
    public void creditChecker() throws Exception {
        CreditChecker creditChecker = new CreditChecker();

        assertTrue(creditChecker.creditChecker(900,800));
        assertFalse(creditChecker.creditChecker(800,900));
    }

}