package com.codingexercise.mapper;


import com.codingexercise.model.AdvertiserModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jenksy on 7/7/17.
 * MyBatis mapper
 */
@Mapper
public interface AdvertiserMapper {

    @Select("SELECT * FROM advertiser WHERE id = #{id}")
    AdvertiserModel findByID(@Param("id") Integer id);

    @Select("SELECT * FROM advertiser WHERE name = #{name}")
    List<AdvertiserModel> findByName(@Param("name") String name);

    @Select("SELECT * FROM advertiser")
    List<AdvertiserModel> findAll();


    @Insert("insert into advertiser(name,address,creditLimit) values(#{name},#{address},#{creditLimit})")
    @SelectKey(statement="call identity()", keyProperty="id",
            before=false, resultType=Integer.class)
    AdvertiserModel insertAdvertiser(AdvertiserModel advertiserModel);


}