package com.resource.controller;

import Bean.Customser;
import baseResponse.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private WebApplicationContext applicationContext;

    @RequestMapping("/in")
    public BaseResponse<Customser> getCustomse(){
        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();

      Customser customser =  new Customser().setAccount("sdad23307216")
                .setPassword("123")
               ;

        return new BaseResponse<>(200,
                "操作成功",
                customser
               );
    }
}
