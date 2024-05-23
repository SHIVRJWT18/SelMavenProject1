package SwagLabs_PageFactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BasePkg.BasePage;
import UtilityPkg.TakeScreenshot;




public class CheckoutCompletePage extends BasePage
{

	public static String Actval;
	public static String Expval;
	public CheckoutCompletePage (WebDriver driver)
	{
		super(driver);
	}
	
	private static final Logger log = LogManager.getLogger(CheckoutCompletePage.class);

	private By GetValidationMessageElem = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

	private By ClickOnBackHomeElem = By.xpath("//*[@id='back-to-products']");
		
 	public void ClickBackHomeButton() 
 	{
 	 elem = getWebElement(ClickOnBackHomeElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickBackHomeButton");
 
 	 log.info("Click To ClickBackHomeButton");
 		
 	}
 	
 	public void GetnVerifyValidationMessage(String ExpMsg) throws Exception
 	{
 	 elem = getWebElement(GetValidationMessageElem);
 			 
	 Actval = elem.getText();
 	 
  	 System.out.println("The actual validation msg is: "+Actval);
  	 
  	 Assert.assertEquals(ExpMsg, Actval,"Actual and Expected Message are not validated");
 
   	 TakeScreenshot.TakeAShot("ValidatopnMsg"+Actval);

 	 log.info("Get n verify the ErrorMessage");
 	}
}