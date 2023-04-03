package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.obsqura.Pages.RadioButtonPage;
import com.obsqura.Pages.SelectCategoriesPage;


public class RadioButtonTest extends Base {
	RadioButtonPage radiobuttonpage ;
	SelectCategoriesPage selectcategoriespage;
	@Test
	public void femaleButton()
	{
	String input="Radio Buttons Demo";
	String expectedValue="Radio button 'Female' is checked";
	selectcategoriespage=new SelectCategoriesPage(driver);
	selectcategoriespage.selectCategory(input);
	radiobuttonpage=new RadioButtonPage(driver);
	String actualValue=radiobuttonpage.radioabuttonaFemaleIsSelectedGetText();
	
	//assertEquals(actualValue,expectedValue,"Radio button 'Female' is  not checked ");
	
	
	}
	

}
