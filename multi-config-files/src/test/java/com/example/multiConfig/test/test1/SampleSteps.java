package com.example.multiConfig.test.test1;

import com.example.multiConfig.test.SampleTestContext;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = {SampleTestConfig.class})
public class SampleSteps {
    SampleTestContext sampleTestContext;
    @Value("${inputText}")
    private String inputText;

    public SampleSteps(SampleTestContext sampleTestContext) {
        this.sampleTestContext = sampleTestContext;
    }

    @Then("^output OK$")
    public void output_OK() {
        Assert.assertEquals(sampleTestContext.getSampleService().get(),inputText) ;
    }
}
