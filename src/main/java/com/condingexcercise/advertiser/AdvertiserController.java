package com.condingexcercise.advertiser;

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
public class AdvertiserController {

    @Autowired
    AdvertiserRepo advertiserRepo;

    @Autowired
    CreditChecker creditChecker;

//    @RequestMapping(method = RequestMethod.POST, value = "/addAd")
//    public HttpEntity<AdvertiserModel> addAd(@RequestBody AdvertiserModel advertiserModel){
//        return new ResponseEntity<AdvertiserModel>(advertiserRepo.save(advertiserModel), HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/getAd/{id}")
//    public HttpEntity<AdvertiserModel> getAd(@PathVariable("id")  Integer id){
//        System.out.println(id);
//        return new ResponseEntity<AdvertiserModel>(advertiserRepo.findOne(id), HttpStatus.OK);
//    }
//
//
//    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
//    public HttpEntity<Iterable<AdvertiserModel>> getAds(){
//        return new ResponseEntity<Iterable<AdvertiserModel>>(advertiserRepo.findAll(), HttpStatus.OK);
//    }
//
//    //id and amount
//    @RequestMapping(value = "/checkScore/{id}/{amount}")
//    public HttpEntity<Boolean> getCredit(@PathVariable("id") Integer id, @PathVariable("amount") int credit){
//        //check wheter the supplied amount is less then credit limit
//        return new ResponseEntity<>(creditChecker.creditChecker(advertiserRepo.findOne(id).getCreditLimit(), credit), HttpStatus.OK);
//    }

}
