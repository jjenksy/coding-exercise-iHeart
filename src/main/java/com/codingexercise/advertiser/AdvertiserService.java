package com.codingexercise.advertiser;

import com.codingexercise.mapper.AdvertiserMapper;
import com.codingexercise.model.AdvertiserModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


/**
 * Created by jenksy on 7/7/17.
 */
@Service
public class AdvertiserService {

    private AdvertiserMapper advertiserMapper;

    public AdvertiserService(AdvertiserMapper advertiserMapper) {
        this.advertiserMapper = advertiserMapper;
    }

    public boolean creditChecker(int creditCurrent, int creditToCheck){
        return creditToCheck < creditCurrent;
    }


    public HttpEntity<AdvertiserModel> checkAdvertiser(AdvertiserModel advertiserModel) {
        boolean checker = checkModel(advertiserModel);
        if(checker){
            //all data exists so insert into db
            advertiserMapper.insertAdvertiser(advertiserModel);
            return new ResponseEntity<AdvertiserModel>(advertiserModel, HttpStatus.OK);
        }else{
            //return an empty model with error for client
            return new ResponseEntity<>(new AdvertiserModel("Advertiser missing information. Insure name, contact name and credit limit are not missing."), HttpStatus.BAD_REQUEST);
        }


    }

    /**
     * The checkmodel method checks to see if all data exists on the model
     * @param advertiserModel the model to check
     * @return true if data exists and false otherwise
     */
    private boolean checkModel(AdvertiserModel advertiserModel) {

        if(advertiserModel.getContactName() ==null) {
            return false;
        }
        if(advertiserModel.getCreditLimit() == null){
            return false;
        }
        if(advertiserModel.getName() == null){
            return false;
        }

        return true;
    }

    /**
     * This method checks to see if the advertiser exist
     * @param id the id to check
     * @return a ResponseEntity with and advertiser or an error message otherwise
     */
    public HttpEntity<AdvertiserModel> getAdvertiserIfExists(Integer id) {
        AdvertiserModel advertiserModel = advertiserMapper.findByID(id);
        if(advertiserModel == null){
            return new ResponseEntity<AdvertiserModel>(new AdvertiserModel("The advertiser with id of "+ id+ " does not exist."), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<AdvertiserModel>(advertiserModel, HttpStatus.OK);
    }
}
