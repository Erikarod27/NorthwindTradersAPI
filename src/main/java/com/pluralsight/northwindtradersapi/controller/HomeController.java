package com.pluralsight.northwindtradersapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path="/name", method= RequestMethod.GET)
    public String name(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path="/country", method= RequestMethod.GET)
    public String country(@RequestParam(defaultValue = "World") String country) {
        return "Hello " + country + "!";
    }

}
