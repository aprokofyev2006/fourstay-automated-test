package com.stay.stepdefs;

import com.stay.pageobjects.HomePage;

import cucumber.api.java.en.When;

public class TestStepDefs2 {
	
	@When("^serching for \"([^\"]*)\"$")
	public void serching_for(String arg1) throws Throwable {
		HomePage homePage = new HomePage();
		homePage.search.sendKeys(arg1);
	}

}
