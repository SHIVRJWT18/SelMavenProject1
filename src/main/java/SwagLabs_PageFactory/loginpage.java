package SwagLabs_PageFactory;


import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import BasePkg.BasePage;
import UtilityPkg.PropertiesLoader;





public class loginpage extends BasePage
{
	public loginpage (WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement elem;
	
	public String givenUrl;
	
	private By EnterUsernameElem = By.xpath("//input[@name='user-name']");

	private By EnterpasswordElem = By.xpath("//input[@name='password']");

	private By LoginButtonElem = By.xpath("//input[@id='login-button']");

	private static final Logger log = LogManager.getLogger(loginpage.class);
	
	public void LaunchTheUrl() throws IOException
	{				
		givenUrl = PropertiesLoader.getProperties("baseurl");
		
		System.out.println("The actual Url is: "+givenUrl+"123");
		
	    log.info("Launch the URL");
	}


    public void ValidateTheUrl()
    {
     String currentUrl = testDriver.getCurrentUrl();
        
     System.out.println("The Entered Url: " +currentUrl);
        
     String expectedUrl = givenUrl;

     if (currentUrl.equals(givenUrl)) 
     {
         System.out.println("Test Url and Current Url are validated");
     }
     else
     {
      Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);	
     }	
        
     log.info("Validate the test Url");
    }

 	public void EnterUsername(String GivenUsername)
 	{
 	 elem = getWebElement(EnterUsernameElem);
 	 
 	 if(GivenUsername!=null)
 	 {
 	  try 
 	  {
 		 GivenUsername = PropertiesLoader.getProperties(GivenUsername);
	  } 
 	  catch (IOException e) 
 	  {
			e.printStackTrace();
	  }
 	 }	 

 	 elem.sendKeys(GivenUsername);
 		
 	 System.out.println("Enter Username is: "+GivenUsername);
 		
 	 log.info("Enter the Username");

 	}

 	public void EnterPassword(String Givenpassword)
 	{
 	 elem = getWebElement(EnterpasswordElem);
 	 
 	 if(Givenpassword!=null)
 	 {
 	  try 
 	  {
 		 Givenpassword = PropertiesLoader.getProperties(Givenpassword);
	  } 
 	  catch (IOException e) 
 	  {
			e.printStackTrace();
	  }
 	 }	 
 		
 	 elem.sendKeys(Givenpassword);
 		
 	 System.out.println("Enter Password is: "+Givenpassword);
 		
 	 log.info("Enter the Password");
 		
 	}

	public void Click_LoginButton()
	{       
	 elem = getWebElement(LoginButtonElem);

	 elem.click();
	 
	 System.out.println("Click to Login Button");
          	
	 log.info("Click_LoginButton");

	}
}