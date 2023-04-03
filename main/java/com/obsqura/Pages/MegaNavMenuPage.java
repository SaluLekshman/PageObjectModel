package com.obsqura.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MegaNavMenuPage   {
	WebDriver driver;
	public MegaNavMenuPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public void navigateToMainMenu(String input)
	{
		List<WebElement> menuElements=driver.findElements(By.xpath("//li[@class='nav-item']//a"));
		for(WebElement mainMenu:menuElements)
		{
			String menuName=mainMenu.getText();
			menuElements.add(mainMenu);
			if(menuName.equals(input))
			{
				mainMenu.click();
				break;
			}
		}
	}

}
