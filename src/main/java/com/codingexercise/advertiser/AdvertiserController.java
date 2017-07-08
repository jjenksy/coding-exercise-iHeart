package com.codingexercise.advertiser;

import com.codingexercise.mapper.AdvertiserMapper;
import com.codingexercise.model.AdvertiserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jenksy on 7/7/17.
 */
@RestController
@RequestMapping(value = "/api/advertiser")
public class AdvertiserController{

    @Autowired
    private CreditChecker creditChecker;
    @Autowired
    private AdvertiserMapper advertiserMapper;


    @RequestMapping(method = RequestMethod.POST, value = "/newAdvertiser")
    public void addAd(@RequestBody AdvertiserModel advertiserModel){
       advertiserMapper.insertAdvertiser(advertiserModel);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAdvertiser/{id}")
    public HttpEntity<AdvertiserModel> getAd(@PathVariable("id")  Integer id){
        System.out.println(id);
        return new ResponseEntity<AdvertiserModel>(advertiserMapper.findByID(id), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public HttpEntity<Iterable<AdvertiserModel>> getAds(){
        return new ResponseEntity<Iterable<AdvertiserModel>>(advertiserMapper.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/checkScore/{id}/{amount}")
    public HttpEntity<Boolean> getCredit(@PathVariable("id") Integer id, @PathVariable("amount") int credit){
        //check wheter the supplied amount is less then credit limit
        return new ResponseEntity<>(creditChecker.creditChecker(advertiserMapper.findByID(id).getCreditLimit(), credit), HttpStatus.OK);
    }

}
