package com.codingexercise.advertiser;

import com.codingexercise.mapper.AdvertiserMapper;
import com.codingexercise.model.AdvertiserModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by jenksy on 7/8/17.
 */
@RunWith(SpringRunner.class)
public class AdvertiserServiceTest {


    @InjectMocks
    private AdvertiserService advertiserService;

    @Mock
    AdvertiserMapper mapper;
    @Before
    public void init(){
        //mockito will fix you injected dependencies
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void creditChecker() throws Exception {

        assertTrue(advertiserService.creditChecker(900,800));
        assertFalse(advertiserService.creditChecker(800,900));
    }

    @Test
    public void checkAdvertiser() throws Exception {
        HttpEntity<AdvertiserModel> checkAdvertiser = advertiserService.checkAdvertiser(new AdvertiserModel("John", "JohnJ",900));

        assertEquals(checkAdvertiser.getBody().getContactName(),"JohnJ");
    }

    @Test
    public void getAdvertiserIfExists() throws Exception {
        HttpEntity<AdvertiserModel> checkAdvertiser = advertiserService.checkAdvertiser(new AdvertiserModel("John", "JohnJ",900));

        HttpEntity<AdvertiserModel> checkAdvertiser1 = advertiserService.getAdvertiserIfExists(checkAdvertiser.getBody().getId());

    }

    @Test
    public void deleteAdvertiserIfExists() throws Exception {
        advertiserService.deleteAdvertiserIfExists(1);
    }

    @Test
    public void putAdvertiserIfExists() throws Exception {
        advertiserService.putAdvertiserIfExists(new AdvertiserModel("John", "JohnJ", 1000));
    }

    @Test
    public void deductCredit() throws Exception {
        advertiserService.deductCredit(1,100);
    }

}