package com.example.mybackendproject.Presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/repositories/languages")
    public String test() {
        return "HelloWorld";
    }
}
