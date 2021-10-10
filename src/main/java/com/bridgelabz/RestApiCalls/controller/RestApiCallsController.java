package com.bridgelabz.RestApiCalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiCallsController {
    @GetMapping("test1")
    public String getMessage() {
        return "Hello from Bridgelabz";
    }
}
