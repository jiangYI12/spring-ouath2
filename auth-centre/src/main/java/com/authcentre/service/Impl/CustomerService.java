package com.authcentre.service.Impl;

import Bean.Customser;
import com.authcentre.mapper.CustomerMapper;
import com.authcentre.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customser getCustomer(String account) {
        return  customerMapper.selectById(1);
    }
}
