package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    private AtomicLong helloWebRequestCounter = new AtomicLong(0);


    @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        helloWebRequestCounter.addAndGet(1);
        model.addAttribute("name", name);
        model.addAttribute("helloWebRequestCounter", helloWebRequestCounter);
        return "greeting";
    }
}
