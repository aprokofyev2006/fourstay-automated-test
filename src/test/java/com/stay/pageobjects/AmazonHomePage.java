package com.stay.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stay.utilities.Driver;

public class AmazonHomePage {
private WebDriver driver;
	
	// this class will hold all the web elements and the actions from the home page
	public AmazonHomePage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	public void search(String item){
		search.sendKeys(item+Keys.ENTER);
	}
	
	
}
