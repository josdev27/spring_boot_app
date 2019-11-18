package com.josdev27.sample.service;

import org.springframework.stereotype.Service;

import com.josdev27.sample.service.impl.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHello(String name) {
        return "Hello, "+ name;
    }

}
