package com.example.multiConfig.steps.test1;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //glue = {"com.example.multiConfig.steps"},
        features = "src/test/resources/features/sample.feature")
public class SampleTest {
}

