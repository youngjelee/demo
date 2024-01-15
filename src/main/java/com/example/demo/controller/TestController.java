package com.example.demo.controller;

import com.example.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestServiceImpl testService;


    @GetMapping("/run1")
    public void run1 () throws Exception {
        testService.run1();
    }

    @GetMapping("/run")
    public void run () throws Exception {
        testService.run();
    }


}
