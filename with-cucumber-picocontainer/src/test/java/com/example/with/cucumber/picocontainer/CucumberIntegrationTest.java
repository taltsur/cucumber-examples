package com.example.with.cucumber.picocontainer;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =
				{
						"src/test/resources/features",
				},
		glue = {"com.example.with.cucumber.picocontainer.steps"},
		plugin = {"pretty", "json:target/cucumber-report.json"})


public class CucumberIntegrationTest {


}
