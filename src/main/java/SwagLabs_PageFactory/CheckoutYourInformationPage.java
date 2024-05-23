package SwagLabs_PageFactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePkg.BasePage;
import UtilityPkg.TakeScreenshot;




public class CheckoutYourInformationPage extends BasePage
{

	public static String Actval;
	public static String Expval;
	public CheckoutYourInformationPage (WebDriver driver)
	{
		super(driver);
	}
	
	private static final Logger log = LogManager.getLogger(CheckoutYourInformationPage.class);


	private By ClickOnCancelElem = By.xpath("//*[@id='cancel']");
	
	private By ClickOnContinueElem = By.xpath("//*[@id='continue']");

	private By EnterfirstnameElem = By.xpath("//input[@name='firstName']");

	private By EnterlastnameElem = By.xpath("//input[@name='lastName']");
	
	private By EnterZip_PostalcodeElem = By.xpath("//input[@name='postalCode']");
	
	private By GetErrorMessageElem = By.xpath("//h3[contains(text(),'Error: First Name is required')]");

	
 	public void ClickCancelButton() 
 	{
 	 elem = getWebElement(ClickOnCancelElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickCancelButton");
 
 	 log.info("Click To ClickCancelButton");
 		
 	}
 	
 	public void ClickContinueButton() 
 	{
 	 elem = getWebElement(ClickOnContinueElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickContinueButton");
 
 	 log.info("Click To ClickContinueButton");
 		
 	}
 	
 	public void EnterFirstName(String Enterfirstname)
 	{
 	 elem = getWebElement(EnterfirstnameElem);

 	 elem.sendKeys(Enterfirstname);
 		
 	 System.out.println("Enter first name is: "+Enterfirstname);
 		
 	 log.info("Enter the EnterFirstName");

 	}

 	public void EnterLastName(String Enterlastname)
 	{
 	 elem = getWebElement(EnterlastnameElem);
 		
 	 elem.sendKeys(Enterlastname);
 		
 	 System.out.println("Enter last name is: "+Enterlastname);
 		
 	 log.info("Enter the EnterLastName");
 		
 	}

 	
 	public void EnterZip_PostalCode(String EnterZipCode)
 	{
 	 elem = getWebElement(EnterZip_PostalcodeElem);
 		
 	 elem.sendKeys(EnterZipCode);
 		
 	 System.out.println("Enter Zip/Postal code is: "+EnterZipCode);
 		
 	 log.info("Enter the EnterZip_PostalCode");
 		
 	}
 	
	public void GetnVerifyErrorMessage(String Experrormsg) throws Exception
 	{
 	 elem = getWebElement(GetErrorMessageElem);
 	 
	 Actval = elem.getText();
 	 
  	 System.out.println("The actual error msg is: "+Actval);
  	 
  	 Assert.assertEquals(Experrormsg, Actval,"Actual and Expected Message are not validated");
 
   	 TakeScreenshot.TakeAShot("ErrorMsg"+Actval);

 	 log.info("Get n verify the ErrorMessage");
 		
 	}

}