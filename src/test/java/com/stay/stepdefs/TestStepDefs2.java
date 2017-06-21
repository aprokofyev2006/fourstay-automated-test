package com.stay.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stay.pageobjects.HomePage;
import com.stay.utilities.Driver;

import cucumber.api.java.en.When;

public class TestStepDefs2 {
	HomePage homePage = new HomePage();
	Wait wait = new WebDriverWait(Driver.getInstance(),15);
	
	@When("^serching for \"([^\"]*)\"$")
	public void serching_for(String arg1) throws Throwable {
		
		homePage.search.sendKeys(arg1+Keys.ENTER);
	}
	
	@When("^search result is more then (\\d+)$")
	public void search_result_is_more_then(int arg1)  {
		
	    wait.until(ExpectedConditions.visibilityOf(homePage.result));
	    String resultString = homePage.result.getText().split("results")[0];
	    Pattern p = Pattern.compile("[0-9]");
	    Matcher m = p.matcher(resultString);
	    StringBuilder sb = new StringBuilder();
	    while(m.find()){
	    	
	    	sb.append(m.group());
	    }
	    int result = Integer.valueOf(sb.toString());
	    System.out.println(result);
	    assertTrue(result>arg1);
	    System.out.println("add for git");
	    assertEquals(1, 0);
	    // comment
	    
	    
	}

}
