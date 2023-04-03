package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.PageUtility;
import utilities.WaitUtility;


public class RadioButtonsDemoPage {
	public WebDriver driver;
	public RadioButtonsDemoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
 By femaleButton=By.xpath("//input[@id='inlineRadio2']");
 By showSelectedValueButton=By.xpath("//button[@id='button-one']");
 By radioButtonFemaleIsChecked=By.xpath("//div[@id='message-one']");
 
 By maleButton=By.xpath("//input[@id='inlineRadio1']");
 By radioButtonMaleIsChecked=By.xpath("//div[@id='message-one']");
 By getResultButton=By.xpath("//button[@id='button-two']");
 
 public WebElement femaleButtonElement()
 {
	 WebElement femaleButtonelement=driver.findElement(femaleButton);
	 return femaleButtonelement;
	 
 }
 public WebElement showSelectedValueButtonElement()
 {
	 WebElement showSelectedValueButtonelement=driver.findElement(showSelectedValueButton);
	 return showSelectedValueButtonelement;
	 
 }
 public WebElement radioButtonFemaleIsCheckedElement()
 {
	 WebElement radioButtonFemaleIsCheckedelement=driver.findElement(radioButtonFemaleIsChecked);
	 return radioButtonFemaleIsCheckedelement ;
	 
 }
 public WebElement maleButtonElement()
 {
	 WebElement malebuttonelement=driver.findElement(maleButton);
	return  malebuttonelement;
	 
 }
 public WebElement radioButtonMaleIsCheckedElement()
 {
	 WebElement radioButtonMaleIsCheckedelement=driver.findElement(radioButtonMaleIsChecked);
	 return radioButtonMaleIsCheckedelement ;
	 
 }
 public WebElement colorOfshowSelectedValueButton()
 {
	 WebElement colorOfshowSelectedValueButtonElement=driver.findElement(showSelectedValueButton);
	 return colorOfshowSelectedValueButtonElement;
 }
 public WebElement backgroundColorOfshowSelectedValueButton()
 {
	 WebElement backgroundcolorOfshowSelectedValueButtonElement=driver.findElement(showSelectedValueButton);
	 return backgroundcolorOfshowSelectedValueButtonElement;
 }
 public WebElement borderColorOfshowSelectedValueButton()
 {
	 WebElement bordercolorOfshowSelectedValueButtonElement=driver.findElement(showSelectedValueButton);
	 return bordercolorOfshowSelectedValueButtonElement;
 }
 
 public WebElement fontSizeOfGetResultButton()
 {
	 WebElement fontSizeOfGetResultButtonElement=driver.findElement(getResultButton);
	 return fontSizeOfGetResultButtonElement;
 }
 public void clickOnfemaleButton()
 
 {
	WaitUtility.waitForElementClickable(driver,femaleButtonElement() );
	PageUtility.clickOnElement(femaleButtonElement());
 }
 public void clickOnshowSelectedValueButton()
 {
	WaitUtility.waitForElementClickable(driver,showSelectedValueButtonElement());
	 PageUtility.clickOnElement(showSelectedValueButtonElement());
 }
 public String radioButtonFemaleIsCheckedGetText()
 {
	 WaitUtility.waitForElement(driver, radioButtonFemaleIsCheckedElement());
	 String outputText= PageUtility.getElementText( radioButtonFemaleIsCheckedElement());
	 return outputText;
 }
 public void clickOnMaleButton()
 {
	 WaitUtility.waitForElementClickable(driver, maleButtonElement());
	 PageUtility.clickOnElement(maleButtonElement());
	 
 }
 public String radioButtonMaleIsCheckedGetText()
 {
	 WaitUtility.waitForElement(driver,radioButtonMaleIsCheckedElement());
	 String outputText= PageUtility.getElementText( radioButtonMaleIsCheckedElement());
	 return outputText;
 }
 public String getColorshowSelectedValueButton()
 {
	// WaitUtility.waitForAttributeToBe(driver,  showSelectedValueButton);
	 PageUtility pageUtility = new PageUtility();
	 return pageUtility.stylePropertyValidation(colorOfshowSelectedValueButton(), "color").toString();
 }
 public String getbackgroundColorshowSelectedValueButton()
 {
	// WaitUtility.waitForAttributeToBe(driver, showSelectedValueButton);
	 PageUtility pageUtility = new PageUtility();
	 return pageUtility.stylePropertyValidation(colorOfshowSelectedValueButton(), "background-color").toString();
 }
 public String getboderColorshowSelectedValueButton()
 {
	 //WaitUtility.waitForAttributeToBe(driver, showSelectedValueButton);
	 PageUtility pageUtility = new PageUtility();
	 return pageUtility.stylePropertyValidation( borderColorOfshowSelectedValueButton(), "border-color").toString();
 }
 public String getFontSizeOfGetResultButton()
 {
	// WaitUtility.waitForAttributeToBe(driver, getResultButton);
	 PageUtility pageUtility = new PageUtility();
	 return pageUtility.stylePropertyValidation(fontSizeOfGetResultButton(), "font-size");
 }
}
