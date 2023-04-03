package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class SingleInputFieldPageFactoryPage {

	WebDriver driver;
	public SingleInputFieldPageFactoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='single-input-field']") WebElement singleInputfieldElement;
	@FindBy(xpath="//button[@id='button-one']") WebElement clickOnShowMessageButton;
	@FindBy(id="button-one") WebElement showMessagebuttonElement;
	@FindBy(xpath="//div[@id='message-one']") WebElement displayMessageElement;
	public void enterDatainInputfieldForm(String input)
	{
		 WaitUtility.waitForElement(driver,singleInputfieldElement );
		 PageUtility.enterText(singleInputfieldElement, input);
	}
	
	
	public void clickOnShowMessageButton()
	{
		 WaitUtility.waitForElementClickable(driver, clickOnShowMessageButton);
		 PageUtility.clickOnElement(clickOnShowMessageButton);
		
	}
	public String simpleInputfieldGettext()
	{
		//WaitUtility.waitFortextToBePresentInElement(driver,displayMessageElement );
		String outputText= PageUtility.getElementText(displayMessageElement);
		return outputText;
	
	}
	
	
	
}
