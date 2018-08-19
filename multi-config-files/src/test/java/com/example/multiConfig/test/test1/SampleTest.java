package com.example.multiConfig.test.test1;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //glue = {"com.example.multiConfig.test"},
        features = "src/test/resources/features/sample.feature")
public class SampleTest {
}

