package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String findOne(@PathVariable("id") String id) {
//    public String hello() {
        return "Hello world!";
    }
}