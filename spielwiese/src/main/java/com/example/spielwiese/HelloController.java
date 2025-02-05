package com.example.spielwiese;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/books/test")
    public String sayHello() {
        return "Test erfolgreich!";
    }
}

