package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.obsqura.Pages.SelectCategoriesPage;
import utilities.PageUtility;

public class RadioButtonPageDemoFactoryTest extends Base {
	
	SelectCategoriesPage selectcategorypage;
	 PageUtility pageutility;
	 com.obsqura.Pages.RadioButtonDemoPageFactoryPage radiobuttonpagefactorypage;
@Test
	public void verifyRadiobuttonDemo()
	{
		String input="Radio Buttons Demo";
		String expectedMessage="Radio button 'Female' is checked";
		selectcategorypage=new SelectCategoriesPage(driver);
		radiobuttonpagefactorypage=new com.obsqura.Pages.RadioButtonDemoPageFactoryPage(driver);
		selectcategorypage.selectCategory(input);
		
		boolean checkmaleRadiobuttonElement= radiobuttonpagefactorypage.maleRadiobuttonElementisEnabled();
		boolean checkfemaleRadiobuttonElement=radiobuttonpagefactorypage.femaleRadiobuttonElementisEnabled();
		assertFalse(checkmaleRadiobuttonElement&&checkfemaleRadiobuttonElement==false, "male radio button and female radio button is enabled");
		radiobuttonpagefactorypage.toclickRadiobutton();
		boolean checkselectionoffemaleradiobutton=radiobuttonpagefactorypage.femaleRadiobuttonElementisSelected();
		assertTrue(checkselectionoffemaleradiobutton==true,"Female radio button is not selected" );
		radiobuttonpagefactorypage.toClickshowSelectedValuebutton();
		String actualMessage=radiobuttonpagefactorypage.toDisplaymessage();
		assertEquals(actualMessage, expectedMessage, "Actual display message and expected display message are not same");
	}
}
