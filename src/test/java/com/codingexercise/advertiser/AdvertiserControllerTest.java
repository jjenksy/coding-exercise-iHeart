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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by jenksy on 7/8/17.
 */
@RunWith(SpringRunner.class)
public class AdvertiserControllerTest {

    @InjectMocks
    private AdvertiserController advertiserController;

    @Mock
    private AdvertiserMapper advertiserMapper;

    @Mock
    private CreditChecker creditChecker;

    @Before
    public void init(){
        //mockito will fix you injected dependencies
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addAd() throws Exception {
        AdvertiserModel am = new AdvertiserModel("John","John J",800);
        advertiserController.addAd(am);

    }

    @Test
    public void getAd() throws Exception {
        //setup the advertiser model to be in mocked database
        AdvertiserModel am = new AdvertiserModel();
        am.setId(1);
        when(advertiserMapper.findByID(1)).thenReturn(am);

        HttpEntity<AdvertiserModel> advertiserModel = advertiserController.getAd(1);

        assertEquals(1,advertiserModel.getBody().getId().intValue());

    }

    @Test
    public void getAds() throws Exception {
        HttpEntity<List<AdvertiserModel>> advertiser = advertiserController.getAds();

        assertArrayEquals(advertiser.getBody().toArray(), new ArrayList<AdvertiserModel>().toArray());
    }

    @Test
    public void getCredit() throws Exception {
        //setup the advertiser model to be in mocked database
        AdvertiserModel am = new AdvertiserModel();
        am.setId(1);
        am.setCreditLimit(800);
        when(advertiserMapper.findByID(1)).thenReturn(am);

        HttpEntity<Boolean> creditFalse = advertiserController.getCredit(1,700);
        System.out.println(creditFalse.getBody());
        assertFalse(creditFalse.getBody());


    }

    @Test
    public void deleteAdvertiser() throws Exception {

        //setup the advertiser model to be in mocked database
        AdvertiserModel am = new AdvertiserModel();
        am.setId(1);
        am.setCreditLimit(800);
        when(advertiserMapper.findByID(1)).thenReturn(am);
        advertiserController.deleteAdvertiser(1);

    }

    @Test
    public void updateAdvertiser() throws Exception {
        //setup the advertiser model to be in mocked database
        AdvertiserModel am = new AdvertiserModel();
        am.setId(1);
        am.setCreditLimit(800);
        when(advertiserMapper.findByID(1)).thenReturn(am);

        am.setCreditLimit(9000);
        advertiserController.updateAdvertiser(am);
    }

}