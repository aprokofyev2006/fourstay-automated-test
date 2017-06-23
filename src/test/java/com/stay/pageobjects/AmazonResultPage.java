package com.stay.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stay.utilities.Driver;

public class AmazonResultPage extends AmazonHomePage {
	
	private WebDriver driver;
	public AmazonResultPage(){
		this.driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='result_0']//h2")
	public WebElement item;
	
	public void clickItemNum(int num){
		driver.findElement(By.xpath("//li[@id='result_"+0+"']//h2")).click();
	}
	
}
