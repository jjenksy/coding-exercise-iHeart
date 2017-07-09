package com.codingexercise.advertiser;

import com.codingexercise.mapper.AdvertiserMapper;
import com.codingexercise.model.AdvertiserModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
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

}