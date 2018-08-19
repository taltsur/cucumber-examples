package com.example.multiConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class SampleServiceImpl implements SampleService {
    @Value("${inputText}")
    private String inputText;

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public void printSomething() {
        System.out.println("Input Message: " + inputText);
    }

    @Override
    public String get() {
        return inputText;
    }
}
