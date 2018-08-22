package com.example.multiConfig.steps.one.config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.example.multiConfig.steps.one.config"},
        features = "src/test/resources/features/feature1.feature")
public class OneTest {
}
