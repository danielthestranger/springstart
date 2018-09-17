package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong helloRESTRequestCounter = new AtomicLong(0);

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        helloRESTRequestCounter.addAndGet(1);
        return new Greeting(helloRESTRequestCounter.intValue(), "Hello, "+ name + "!");
    }
}
