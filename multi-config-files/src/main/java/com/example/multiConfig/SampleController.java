package com.example.multiConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Controller")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping("IsAlive")
    public boolean isAlive() {
        return sampleService.isAlive();
    }

    @GetMapping("PrintSomething")
    public void printSomthing() {
        sampleService.printSomething();
    }
}
