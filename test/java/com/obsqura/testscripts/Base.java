package com.obsqura.testscripts;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public  WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser()
	
	{
		String path=System.getProperty("user.dir")+"\\src\\main\\\\java\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver( options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();//to maximize the window screen 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void test()
	{
		
	}
	@AfterMethod
	public void driverQuit()
	{
		driver.quit();
	}

}
