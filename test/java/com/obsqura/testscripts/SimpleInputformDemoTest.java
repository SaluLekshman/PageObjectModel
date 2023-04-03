package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsqura.Pages.SimpleInputformDemoPage;

import utilities.ExcelUtility;

public class SimpleInputformDemoTest extends Base{
	SimpleInputformDemoPage simpleinputformdemopage;
	@Test
	public void verifySingleInputField() throws IOException
	{
		String expectedValue="Your Message : abc";
	    String input=ExcelUtility.getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\testdata.xlsx","SingleInputData");
		simpleinputformdemopage=new SimpleInputformDemoPage(driver);
		simpleinputformdemopage.enterDatainInputfieldForm(input);
		simpleinputformdemopage.clickOnShowMessageButton();
		String actualValue=simpleinputformdemopage.simpleInputfieldGettext();
		assertEquals(actualValue, expectedValue, "your message is not"+expectedValue);
		
	}
}
