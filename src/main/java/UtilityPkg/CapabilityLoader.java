package UtilityPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;





public class CapabilityLoader
{
	
	public static WebDriver driver = null;
		
	//BROWSER value fetched from POM with Chrome being the default value 
	private static final String Brow = System.getProperty("browser", "Chrome");
	

    public static WebDriver createWebDriver() {
    	
		//Browser configuration - can add more browsers and remote driver here
		if (Brow.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); //can also use set property method for browser executables
			driver = new FirefoxDriver();
			
			return driver;
         }
		else if (Brow.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);  
			
			return driver;
         }
		 else if (Brow.equals("IE")) {
			 WebDriverManager.iedriver().setup();
             driver = new InternetExplorerDriver();
             
             return driver;
         }
		 else {
             throw new RuntimeException("Browser type unsupported");
         }
		
		
		

			
        }
}