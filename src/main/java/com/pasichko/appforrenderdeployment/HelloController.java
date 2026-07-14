package com.pasichko.appforrenderdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String getHelloMessage() {
        return "Hello Fundamentals DevOps from Vlad!";
    }
}
