package com.example.with.cucumber.picocontainer.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.lang3.time.StopWatch;

public class StepImpl2 {
    private TestContext testContext;
    private StopWatch watch = new StopWatch();;
    public StepImpl2(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void before(Scenario scenario) {
        watch.start();
        String rawFeatureName = scenario.getId().split(";")[0].replace("-", " ");
        String featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
        System.out.println("============= starting scenario:" + scenario.getName() + " =============\n");
    }

    @After
    public void after(Scenario scenario) {
        watch.stop();
        String rawFeatureName = scenario.getId().split(";")[0].replace("-", " ");
        String featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
        System.out.println("\n============= end scenario:" + scenario.getName() + " Time Elapsed: " + watch.getTime() +" =============\n");
    }

    @Given("^hi1 (.*)$")
    public void hi(String name) throws Throwable {
        System.out.println("name=" + name);
    }

    @Then("^getting shared param$")
    public void getting_shared_param() throws Throwable {
        System.out.println("world.sharedParam2= " + testContext.sharedParam2);
    }


    @Then("^bi1 (\\d+)$")
    public void bi1(int price) throws Throwable {
        System.out.println("price=" + price);
    }
}
