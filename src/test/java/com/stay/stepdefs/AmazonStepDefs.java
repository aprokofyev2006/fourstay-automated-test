package com.stay.stepdefs;

import org.openqa.selenium.WebDriver;

import com.stay.pageobjects.AmazonHomePage;
import com.stay.pageobjects.AmazonResultPage;
import com.stay.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonStepDefs {
	WebDriver driver=Driver.getInstance();
	
	AmazonHomePage amazonHomePage = new AmazonHomePage();
	AmazonResultPage amazonResultPage = new AmazonResultPage();
	
	@Given("^user on the Amazon home page$")
	public void user_on_the_Amazon_home_page() throws Throwable {
	   driver.get("https://www.amazon.com/");
	}

	@Given("^user searching for \"([^\"]*)\"$")
	public void user_searching_for(String arg1) throws Throwable {
	   amazonHomePage.search(arg1);
	}

	@Given("^user choose first result$")
	public void user_choose_first_result() throws Throwable {
	   amazonResultPage.search("ipone 6");
	}

	@Then("^user should be able to use methods from home page$")
	public void user_should_be_able_to_use_methods_from_home_page() throws Throwable {
	   Thread.sleep(5000);
	}

}
