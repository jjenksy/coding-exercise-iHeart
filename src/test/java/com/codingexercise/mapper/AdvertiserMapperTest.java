package com.codingexercise.mapper;

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
 * Created by jenksy on 7/9/17.
 */
@RunWith(SpringRunner.class)
public class AdvertiserMapperTest {
    @Mock
    private AdvertiserMapper advertiserMapper;


    @Test
    public void insertAdvertiserAndFindDeleteAndUpdate() throws Exception {
        AdvertiserModel advertiserModel = new AdvertiserModel("John", "JohnJ", 900);
        advertiserModel.setId(1);
        advertiserMapper.insertAdvertiser(advertiserModel);
        AdvertiserModel advertiserModel1 = advertiserMapper.findByID(1);

//        assertEquals(advertiserModel1,advertiserModel);
        advertiserModel.setCreditLimit(100);
        advertiserMapper.update(advertiserModel);
        AdvertiserModel advertiserModel2 = advertiserMapper.findByID(1);
    }


}