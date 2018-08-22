package com.example.multiConfig.steps.one.config;

import com.example.Color;
import cucumber.api.java.en.Given;

import java.util.List;


public class Steps {
    @Given("the following colors are available")
    public void the_following_colors_are_available(List<Color> colors) {

        for (Color currColor : colors) {
            System.out.println("currColor=" +currColor);
        }
    }

}
