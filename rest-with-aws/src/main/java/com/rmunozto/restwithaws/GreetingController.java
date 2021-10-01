package com.rmunozto.restwithaws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private final String template = "Hello you %s!";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "DEFAULT VALUE") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }





}
