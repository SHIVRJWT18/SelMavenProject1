package UtilityPkg;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BasePkg.BasePage;



public class TakeScreenshot extends BasePage {
	
	public TakeScreenshot(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void TakeAShot(String Foldername) throws Exception
	{
	 try 
	 {
	  String path = System.getProperty("user.dir")+"\\SHOT\\"+Foldername+"\\"+testDriver+".png";
 	  TakesScreenshot ts=(TakesScreenshot)testDriver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source,new File(path));
		
	 }
	 catch (Exception e) 
	 {
	  System.out.println("Exception while taking screenshot");
	 }
	 
	 

	}

}
