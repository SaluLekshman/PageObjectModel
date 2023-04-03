package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class RadioButtonDemoPageFactoryPage {
	public WebDriver driver;
	public RadioButtonDemoPageFactoryPage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	By showSelectedValuebutton=By.xpath("//button[@id='button-one']");
	@FindBy(xpath="//input[@id='inlineRadio1']") WebElement maleRadiobuttonelement;
	@FindBy(xpath="//input[@id='inlineRadio2']") WebElement femaleRadiobuttonelement;
	@FindBy(xpath="//button[@id='button-one']") WebElement showSelectedValuebuttonelement;
	@FindBy(xpath="//div[@id='message-one']") WebElement displayResultelement;
	
	public boolean maleRadiobuttonElementisEnabled()
	{
		return PageUtility.elementIsEnabled(maleRadiobuttonelement);
		
	}
	public boolean femaleRadiobuttonElementisEnabled()
	{
		return PageUtility.elementIsEnabled(femaleRadiobuttonelement);
	}
	public void toclickRadiobutton()
	{
		WaitUtility.waitForElementClickable(driver, femaleRadiobuttonelement);
		PageUtility.clickOnElement(femaleRadiobuttonelement);
	}
	public boolean femaleRadiobuttonElementisSelected()
	{
		return PageUtility.isSelected( femaleRadiobuttonelement);
	}
	public void toClickshowSelectedValuebutton()
	{
		WaitUtility.waitForElementClickable(driver, showSelectedValuebutton);;
		PageUtility.clickOnElement(showSelectedValuebuttonelement);
	}
	public String toDisplaymessage()
	{
		String output=PageUtility.getElementText(displayResultelement);
		return output;
	}
}
