package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.obsqura.Pages.RadioButtonsDemoPage;
import com.obsqura.Pages.SelectCategoriesPage;

public class RadioButtonsDemoTest extends Base {
	RadioButtonsDemoPage radiobuttondemopage;
	SelectCategoriesPage selectcategoriespage;
	@Test(priority=1)
	public void femaleButtonClick()
	{
		String input="Radio Buttons Demo";
		String expectedValue="Radio button 'Female' is checked";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
		boolean checkFemaleRadioButton=radiobuttondemopage.femaleButtonElement().isEnabled();
		assertTrue(checkFemaleRadioButton,"Female radio button is not enabled");
		radiobuttondemopage.clickOnfemaleButton();
		boolean isSelcetedFemaleButton=radiobuttondemopage.femaleButtonElement().isSelected();
		assertTrue(isSelcetedFemaleButton,"Female button is not selected");
		radiobuttondemopage.clickOnshowSelectedValueButton();
		String actualValue=radiobuttondemopage.radioButtonFemaleIsCheckedGetText();
		System.out.println("The actual text is "+actualValue);
		assertEquals(actualValue,expectedValue,"Radio button 'Female' is  not checked ");
	}
	@Test
	public void maleButtonClick()
	{
		String input="Radio Buttons Demo";
		String expectedValue="Radio button 'Male' is checked";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
	    boolean checkMaleRadioButton=radiobuttondemopage.maleButtonElement().isEnabled();
	    assertTrue(checkMaleRadioButton,"male radio button is not enabled");
	    radiobuttondemopage.clickOnMaleButton();
	    boolean isSelcetedMaleButton=radiobuttondemopage.maleButtonElement().isSelected();
		assertTrue(isSelcetedMaleButton,"male button is not selected");
		radiobuttondemopage.clickOnshowSelectedValueButton();
		String actualValue=radiobuttondemopage.radioButtonMaleIsCheckedGetText();
	    assertEquals(actualValue,expectedValue,"Radio button 'male' is  not checked ");
	    
		
	}
	@Test
	public void color()
	{
		String input="Radio Buttons Demo";
		String expectedColor="rgba(255, 255, 255, 1)";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
		String actualColor=radiobuttondemopage.getColorshowSelectedValueButton();
		assertEquals(expectedColor,actualColor,"font color is not white");
	}
	@Test
	public void backGroundcolor()
	{
		String input="Radio Buttons Demo";
		String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
		String actualBackGroundColor=radiobuttondemopage.getbackgroundColorshowSelectedValueButton();
		assertEquals( expectedBackGroundColor, actualBackGroundColor,"font color is not white");
	}
	@Test
	public void bondcolor()
	{
		String input="Radio Buttons Demo";
		//String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
		String actualBackGroundColor=radiobuttondemopage.getboderColorshowSelectedValueButton();
		//assertEquals( expectedBackGroundColor, actualBackGroundColor,"font color is not white");
	}
	@Test
	public void fontSizeGetResult()
	{
		String input="Radio Buttons Demo";
		//String expectedfontSizeGetResult ="1rem";
		selectcategoriespage=new SelectCategoriesPage(driver);
		selectcategoriespage.selectCategory(input);
		radiobuttondemopage=new RadioButtonsDemoPage(driver);
        radiobuttondemopage.fontSizeOfGetResultButton();
		//assertEquals(expectedfontSizeGetResult,actualfontSizeGetResult,"font size is not 1rem");
		
		
	}
	@Test(priority=2)
	public void dummy1()
	{
		
	}
	@Test(priority=3)
	public void dummy2()
	{
		
	}
	
	
}
