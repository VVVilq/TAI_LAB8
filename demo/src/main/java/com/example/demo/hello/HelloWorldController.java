package com.example.demo.hello;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String helloWorld(){
        return "hellow world";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hellow world");
    }

    @GetMapping(path="hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world %s", name));
    }
}
