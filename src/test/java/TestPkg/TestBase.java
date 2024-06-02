package TestPkg;



import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import UtilityPkg.CapabilityLoader;
import UtilityPkg.PropertiesLoader;





public class TestBase {
    /********** Replace with your own details ***********/
	
	protected WebDriver driver;
    public static String Testurl;
    
    public WebDriver getDriver()
    {
        return driver;
    }
    
    @BeforeMethod()
    public  void loadBaseUrl()  throws IOException
    {
        // ExtentReportManager.createNewTest(method);

    	driver = CapabilityLoader.createWebDriver();
        		
    	driver.manage().window().maximize();
		
		String Testurl = PropertiesLoader.getProperties("baseurl"); 
					    
	    driver.get(Testurl);	    			    
    }
    
    @AfterMethod(alwaysRun = true)
	public void screenshotAndDeleteCookies(ITestResult testResult) throws IOException 
    {
	/*	if(testResult.getStatus() == ITestResult.SUCCESS)
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("PassedScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));	
		}
		else
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("FailedScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
		}	
    */			
		//Deleting cookies
		driver.manage().deleteAllCookies();
		
		driver.quit();
	}

    @AfterSuite   
    public void closerReporter()
    {
    	
    }
  }
