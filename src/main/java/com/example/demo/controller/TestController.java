package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.PersonService;
import com.example.demo.service.TestService;
import com.example.demo.util.Response;



@Controller
public class TestController {

	@Resource
    private TestService testService;
    @Resource
    private PersonService personService;
    
    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return testService.sayHello("Chenqimiao");
    }
    
    @RequestMapping(value = "/person" ,method = RequestMethod.GET)
    @ResponseBody
    public Response person(){
     
        return Response.success(personService.findAllUser());
    }

}
