package com.eazybytes.accounts;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping
    public String sayHello(){
        return "Hi World";
    }
}
