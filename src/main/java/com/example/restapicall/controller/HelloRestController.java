package com.example.restapicall.controller;


import org.springframework.web.bind.annotation.*;
import com.example.restapicall.model.User;

@RestController
@RequestMapping("/web")
public class HelloRestController {

    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+" From BridgeLabz";
    }
    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,@RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
