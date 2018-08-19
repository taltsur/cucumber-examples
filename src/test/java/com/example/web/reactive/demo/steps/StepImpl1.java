package com.example.web.reactive.demo.steps;

import com.example.web.reactive.demo.Color;
import com.example.web.reactive.demo.Grocery;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

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
