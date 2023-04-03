package com.obsqura.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PageUtility;
import utilities.WaitUtility;

public class DragAndDropPage {
WebDriver driver;
public DragAndDropPage(WebDriver driver)
{
	this.driver=driver;
}
By source=By.xpath("//span[text()='Draggable n°1']");
By destination=By.xpath("//div[@id='mydropzone']");
public WebElement dragAndDropElement()
{
	WebElement dragAndDropSourceelement=driver.findElement(source);
	WebElement dragAndDropDestinationelement=driver.findElement(destination);
	Actions action = new Actions(driver);
    //action.dragAndDrop(source, destination).build().perform();
   action.clickAndHold((WebElement) source).moveToElement((WebElement) destination).release((WebElement) destination).build().perform();
	return dragAndDropSourceelement;
	
}
/*
 * public void dragAndDrop() { WaitUtility.waitForElementIsPresent(driver,
 * source); PageUtility.dragAnddrop(, null, driver); }
 */
}
