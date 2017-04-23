package com.stay.stepdefs;

import static org.junit.Assert.assertTrue;

import com.stay.pageobjects.HomePage;
import com.stay.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefs {
	
	@When("^I run this$")
	public void i_run_this() throws Throwable {
		
		Driver.getInstance().get("http://google.com");
	 
	}

	@Then("^it should pass$")
	public void it_should_pass() throws Throwable {
		assertTrue(Driver.getInstance().getTitle().contains("Google"));
		HomePage homePage = new HomePage();
		homePage.search.sendKeys("Test");
	 
	 
	}

}
