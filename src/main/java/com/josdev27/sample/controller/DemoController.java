package com.josdev27.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.josdev27.sample.service.impl.DemoService;

@RestController
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @Autowired
    private DemoService demoService;
    
    @GetMapping(value = "/hello")
    public ResponseEntity<String> getHello(@RequestParam("name") String name) {
        return ResponseEntity.ok().body(demoService.getHello(name));
    }
    
}
