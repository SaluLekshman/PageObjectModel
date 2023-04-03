package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.obsqura.Pages.SimpleInputformDemoPage;
import com.obsqura.Pages.SingleInputFieldPageFactoryPage;

import utilities.ExcelUtility;

public class SingleInputFieldPageFactoryTest extends Base {
	SingleInputFieldPageFactoryPage singleinputfieldpagefactorypage;
	

@Test
public void verifySingleInputField() throws IOException
{
	String expectedValue="Your Message : abc";
    String input=ExcelUtility.getString(0,0,System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\testdata.xlsx","SingleInputData");
    singleinputfieldpagefactorypage=new SingleInputFieldPageFactoryPage(driver);
    singleinputfieldpagefactorypage.enterDatainInputfieldForm(input);
    singleinputfieldpagefactorypage.clickOnShowMessageButton();
	String actualValue=singleinputfieldpagefactorypage.simpleInputfieldGettext();
	assertEquals(actualValue, expectedValue, "your message is not"+expectedValue);
	
}
}
