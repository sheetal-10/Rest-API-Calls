package com.bridgelabz.RestApiCalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiCallsController {
    @GetMapping("test1")
    public String getMessage() {
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getMessage(@RequestParam String name) {
        return "Hello : " + name + " from bridgelabz ";
    }
}
