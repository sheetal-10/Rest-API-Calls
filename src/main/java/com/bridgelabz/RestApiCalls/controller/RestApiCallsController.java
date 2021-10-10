package com.bridgelabz.RestApiCalls.controller;

import com.bridgelabz.RestApiCalls.entity.Details;
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

    @RequestMapping(value = "/test2/{name}", method = RequestMethod.GET)
    public String getPathMessage(@PathVariable String name){
        return "Hello : " + name + " from bridgelabz ";
    }

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    public String getJsonMessage(@RequestBody Details data){
        return data.details();
    }
}
