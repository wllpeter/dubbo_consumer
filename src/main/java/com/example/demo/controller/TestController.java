package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.TestService;



@Controller
public class TestController {

	@Resource
    private TestService testService;
    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return testService.sayHello("Chenqimiao");
    }
}
