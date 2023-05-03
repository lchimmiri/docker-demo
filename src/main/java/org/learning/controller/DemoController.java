package org.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class DemoController {

    @GetMapping("/")
    public String sayHello(){
        return "Docker integration is successful";
    }
}
