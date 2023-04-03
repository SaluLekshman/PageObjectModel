package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.PageUtility;
import utilities.WaitUtility;

public class CheckboxDemoPage {
	WebDriver driver;
	public CheckboxDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By clickOnThisCheckbox=By.xpath("//input[@id='gridCheck']");
	By succesCheckboxischeckedMessage=By.xpath("//div[@id='message-one']");
	By selectAllButton=By.xpath("//input[@id='button-two']");
	
	public WebElement clickOnThisTheckboxElement()
	{
		WebElement clickOnThisCheckboxelement =driver.findElement(clickOnThisCheckbox);
		return clickOnThisCheckboxelement;
		
	}
	public WebElement succesCheckboxischeckedElement()
	{
		WebElement succesCheckboxischeckedelement=driver.findElement(succesCheckboxischeckedMessage);
		return succesCheckboxischeckedelement;
	}
	public WebElement selectAllButtonElement()
	{
		WebElement selectAllButtonelement=driver.findElement(selectAllButton);
		return selectAllButtonelement ;
		
	}
	public void clickOnThisCheckboxElementButton()
	{
		 WaitUtility.waitForElementClickable(driver, clickOnThisTheckboxElement());
		 PageUtility.clickOnElement(clickOnThisTheckboxElement());
	}
	public String succesCheckboxischeckedGetText()
	{
		WaitUtility.waitForElement(driver, succesCheckboxischeckedElement());
		String outputText= PageUtility.getElementText(succesCheckboxischeckedElement());
		return outputText;
	}
	public void doubleClickSelectAllButton()//assignment
	{
		PageUtility.doubleClick(selectAllButtonElement(), driver);
		
	}
	
	  public void clickAndHoldSelectAllButton()
	  {
		  PageUtility.clickAndHoldOnElement(selectAllButtonElement(), driver);
	  
	  }
	 public void rightClickSelectAllButton()
	 {
		 PageUtility.rightClick(selectAllButtonElement(), driver); 
	 }
}
