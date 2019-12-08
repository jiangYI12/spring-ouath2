package com.auth.service;

import Bean.Customser;
import com.auth.mapper.CustomerMapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailService implements UserDetailsService {
    @Autowired
    private CustomerMapper customserMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Customser customser =  customserMapper.selectOne(Wrappers.<Customser>emptyWrapper().eq("account",s));
        return new Customser("account","123","123","$2a$10$ZxTT1Ed6d/tita2fqtXp4OIUB/ohQQn8lUImNXYdhGzxgJlAPggqy","123","123");
    }
}
