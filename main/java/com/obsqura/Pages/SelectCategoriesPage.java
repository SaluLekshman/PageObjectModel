package com.obsqura.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectCategoriesPage {
	WebDriver driver;
	public SelectCategoriesPage(WebDriver driver)
	{
		this.driver=driver;//same driver 
		
	}
	@Test
	public void selectCategory(String input)
	{   
		By categories=By.xpath("//li[@class='list-group-item']//a");
		List<WebElement> selectCategoryelement=driver.findElements(categories);
		for(WebElement category:selectCategoryelement)
		{
			String categoryName=category.getText();
			if(categoryName.equals(input))
			{
				category.click();
				break;
			}
		}
	}
}
