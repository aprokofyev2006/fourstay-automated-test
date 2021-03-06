package com.stay.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.stay.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	@Before
	public void setUp(){
		Driver.getInstance().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Driver.getInstance().manage().window().maximize();
	}
	
	Scenario scenario;
	@Before
	public void beforeScenario(Scenario scenario) {
	  this.scenario = scenario;
	  System.out.println("before each scenario");
	}
	
	@After
	public void threadDown(Scenario scenario ){
		// this method takes screenshot if scenario fails
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			
		}
		Driver.closeDriver();
	}
}
