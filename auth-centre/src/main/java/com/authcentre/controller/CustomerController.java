package com.authcentre.controller;

import Bean.Customser;
import baseResponse.BaseResponse;
import com.authcentre.service.Impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/msg")
    @ResponseBody
    public BaseResponse<Customser> getMsg(){

        return new BaseResponse<Customser>(200,"操作成功",customerService.getCustomer("sdad23307216"));
    }

    @RequestMapping("/cache")
    @ResponseBody
    @Cacheable(value = "ouath")
    public BaseResponse<String> getCache(){
        return null;
    }
}
