package com.obsqura.Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.PageUtility;
import utilities.WaitUtility;

public class CheckboxDemoPagefactoryPage {
	public WebDriver driver;
	
	public CheckboxDemoPagefactoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy (xpath="//input[@id='gridCheck']") WebElement clickOnThisTheckboxElement;
	@FindBy(xpath="//div[@id='message-one']") WebElement succesCheckboxischeckedMessageElement;
	public void clickOnThisCheckboxElementButton()
	{
		 WaitUtility.waitForElementClickable(driver, clickOnThisTheckboxElement);
		 PageUtility.clickOnElement(clickOnThisTheckboxElement);
	}
	public boolean clickOnThisTheckboxEnabledElement()
	{
		 WaitUtility.waitForElementClickable(driver, clickOnThisTheckboxElement);
		 return PageUtility.elementIsEnabled( clickOnThisTheckboxElement);
	}
	public boolean clickOnThisTheckboxSelectedElement()
	{
		 WaitUtility.waitForElementClickable(driver, clickOnThisTheckboxElement);
		 return PageUtility.isSelected(clickOnThisTheckboxElement);
	}
	public String succesCheckboxischeckedGetText()
	{
		WaitUtility.waitForElement(driver, succesCheckboxischeckedMessageElement);
		String outputText= PageUtility.getElementText(succesCheckboxischeckedMessageElement);
		return outputText;
	}
}


