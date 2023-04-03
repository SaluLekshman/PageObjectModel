
package com.obsqura.testscripts;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.Pages.CheckboxDemoPage;
import com.obsqura.Pages.SelectCategoriesPage;

public class CheckboxDemoTest extends Base{
	
	 CheckboxDemoPage checkboxdemopage;
	 SelectCategoriesPage selectcategoriespage;
	 @Test
	 public void verifycheckboxdemopage()
	 {
	  String input="Checkbox Demo";
	  String expectedValue="Success - Check box is checked";
	  selectcategoriespage=new SelectCategoriesPage(driver);
	  selectcategoriespage.selectCategory(input);
	  checkboxdemopage=new CheckboxDemoPage(driver);
	  boolean isEnabledclickOnThisTheckbox=checkboxdemopage.clickOnThisTheckboxElement().isEnabled();
	  assertTrue(isEnabledclickOnThisTheckbox,"Click on this check box is not enabled");
	  checkboxdemopage.clickOnThisCheckboxElementButton();
	  boolean clickOnThisCheckbox=checkboxdemopage.clickOnThisTheckboxElement().isSelected();
	  assertTrue(clickOnThisCheckbox,"click On This check box is not selected");
	  String actualValue=checkboxdemopage.succesCheckboxischeckedGetText();
	  assertEquals(actualValue,expectedValue,"Check box is checked is failed");
	  
	  checkboxdemopage.doubleClickSelectAllButton();
	  checkboxdemopage.clickAndHoldSelectAllButton();
	  checkboxdemopage.rightClickSelectAllButton();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	
	
	

}
