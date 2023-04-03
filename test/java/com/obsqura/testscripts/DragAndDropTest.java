package com.obsqura.testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.obsqura.Pages.DragAndDropPage;

public class DragAndDropTest extends Base {
	
	DragAndDropPage draganddroppage;
	//@Test
	public void dragAndDropmethod()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		draganddroppage=new DragAndDropPage(driver);
		draganddroppage.dragAndDropElement();
		 
	}
}
