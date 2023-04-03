package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.PageUtility;

public class RadioButtonPage {
	public WebDriver driver;
	public RadioButtonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By radioabuttonaFemaleIsSelected=By.xpath("//div[@id='message-one']");

	/*
	 * //@FindBy(xpath="//div[@id='message-one']") WebElement
	 * radioabuttonaFemaleIsSelectedElement; public String
	 * radioabuttonaFemaleIsSelected() { //return
	 * PageUtility.getsElementText(radioabuttonaFemaleIsSelectedElement); return
	 * radioabuttonaFemaleIsSelectedElement1.getText(); }
	 * 
	 * }
	 */
	
	public WebElement radioabuttonaFemaleIsSelectedElement()
	{
		WebElement radioabuttonaFemaleIsSelectedElement=driver.findElement(radioabuttonaFemaleIsSelected);
		return radioabuttonaFemaleIsSelectedElement;
	}
	public String radioabuttonaFemaleIsSelectedGetText()
	{
		return radioabuttonaFemaleIsSelectedElement().getText();
	}
}
