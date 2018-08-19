package com.example.with.expressions.steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepImpl2 {

    @Before
    public void before(Scenario scenario) {
        String rawFeatureName = scenario.getId().split(";")[0].replace("-", " ");
        String featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
        System.out.println("============= starting scenario:" + scenario.getName() + " =============");
    }

    @Given("^hi1 (.*)$")
    public void hi(String name) throws Throwable {
        System.out.println("name=" + name);
    }


    @Then("^bi1 (\\d+)$")
    public void bi1(int price) throws Throwable {
        System.out.println("price=" + price);
    }
}