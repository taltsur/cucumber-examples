package com.example.with.cucumber.picocontainer.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepImpl1 {
    private TestContext testContext;

    public StepImpl1(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("^hi$")
    public void hi() throws Throwable {
        testContext.sharedParam2 = 1;
    }

    @Then("^bi$")
    public void bi() throws Throwable {

    }
}
