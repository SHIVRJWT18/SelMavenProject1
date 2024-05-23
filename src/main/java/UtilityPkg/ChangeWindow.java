package UtilityPkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BasePkg.BasePage;

public class ChangeWindow extends BasePage {
	
	public ChangeWindow(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void switchWindowToFrame(WebElement element) throws InterruptedException 
	{
		testDriver.switchTo().frame(element);
		Thread.sleep(5000);
	}
	
	public void switchToDefaultWindow() throws InterruptedException
	{
		 testDriver.switchTo().defaultContent();			
		 Thread.sleep(3000);
	}
	
	public static void switchwindowForward() throws InterruptedException 
	{
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (testDriver.getWindowHandles());
		System.out.println("Total No of Tabs are: "+tabs.size());
		testDriver.switchTo().window((String) tabs.get(tabs.size()-1));
		Thread.sleep(2000);
	}
	public static void switchwindowBackward(WebDriver driver) throws InterruptedException {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println("Total No of Tabs are: "+tabs.size());
		driver.switchTo().window((String) tabs.get(tabs.size()-2));
		Thread.sleep(2000);
	}
	
	public static void RefreshTab() throws InterruptedException
	{
         testDriver.navigate().refresh();	     
         Thread.sleep(2000);
	}


		

	}

