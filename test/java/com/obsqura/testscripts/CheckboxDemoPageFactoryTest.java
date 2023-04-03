package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.Pages.CheckboxDemoPagefactoryPage;
import com.obsqura.Pages.SelectCategoriesPage;

public class CheckboxDemoPageFactoryTest extends Base {
	CheckboxDemoPagefactoryPage checkboxdemopagefactorypage;
	SelectCategoriesPage selectcategoriespage;
	 @Test
	 public void verifycheckboxdemopage()
	 {
	  String input="Checkbox Demo";
	  String expectedValue="Success - Check box is checked";
	  selectcategoriespage=new SelectCategoriesPage(driver);
	  selectcategoriespage.selectCategory(input);
	  checkboxdemopagefactorypage=new  CheckboxDemoPagefactoryPage(driver);
	  boolean isEnabledclickOnThisTheckbox=checkboxdemopagefactorypage.clickOnThisTheckboxEnabledElement();
	  assertTrue(isEnabledclickOnThisTheckbox,"Click on this check box is not enabled");
	  checkboxdemopagefactorypage.clickOnThisCheckboxElementButton();
	  boolean clickOnThisCheckbox=checkboxdemopagefactorypage.clickOnThisTheckboxSelectedElement();
	  assertTrue(clickOnThisCheckbox,"click On This check box is not selected");
	  String actualValue=checkboxdemopagefactorypage.succesCheckboxischeckedGetText();
	  assertEquals(actualValue,expectedValue,"Check box is checked is failed");
	 }
	

}
