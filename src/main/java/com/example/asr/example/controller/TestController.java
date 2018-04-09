package com.example.asr.example.controller;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestController {


    @Autowired
    private HazelcastInstance instance;



    @RequestMapping(value = "test")
    public String appName(){

        return "App1" + instance.getAtomicLong("long-test").incrementAndGet();
    }


}
