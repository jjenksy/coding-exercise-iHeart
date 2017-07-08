package com.codingexercise.advertiser;

import org.springframework.stereotype.Service;

/**
 * Created by jenksy on 7/7/17.
 */
@Service
public class CreditChecker {

    public boolean creditChecker(int creditCurrent, int creditToCheck){
        return creditToCheck < creditCurrent;
    }
}
