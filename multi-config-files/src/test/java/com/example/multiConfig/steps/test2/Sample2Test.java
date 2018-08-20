package com.example.multiConfig.steps.test2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //glue = {"com.example.multiConfig.steps.test2"},
        features = "src/test/resources/features/sample2.feature")
public class Sample2Test {
}

