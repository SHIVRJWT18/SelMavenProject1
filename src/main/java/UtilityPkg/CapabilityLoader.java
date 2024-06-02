package UtilityPkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CapabilityLoader
{
 public static WebDriver driver;
 public static String browsr = System.getProperty("Browser");
 /*browserser value fetched from Config Package 
   Here System.getProperty() is equivalent method to Properties.getProperty() 
   to read Properties File
 */

    public static WebDriver createWebDriver() throws IOException 
    {
     String browsr = PropertiesLoader.getProperties("browser");	
    	    	
     //browserser configuration - can add more browsersers and remote driver here	
	 if (browsr.equalsIgnoreCase("Firefox")) 
	 {
			WebDriverManager.firefoxdriver().setup(); //can also use set property method for browserser executables
			driver = new FirefoxDriver();
			
			return driver;
      }
		
	  else if (browsr.equalsIgnoreCase("Chrome")) 
	  {
	      WebDriverManager.chromedriver().setup();
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("--disable-notifications");
	      driver = new ChromeDriver(options);  
	      return driver;
      }
      
	   else if (browsr.equalsIgnoreCase("IE")) 
	   {
		   WebDriverManager.iedriver().setup();
           driver = new InternetExplorerDriver();
           return driver;
       }
		 
	   else 
	   {
             throw new RuntimeException("Running Browser seems to be incomptabile, Please Change!");
       }
		
	
			
        }
}