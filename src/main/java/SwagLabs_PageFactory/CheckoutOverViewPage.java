package SwagLabs_PageFactory;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePkg.BasePage;




public class CheckoutOverViewPage extends BasePage
{

	
	public CheckoutOverViewPage (WebDriver driver)
	{
		super(driver);
	}
	
	private static final Logger log = LogManager.getLogger(CheckoutOverViewPage.class);


	private By ClickOnCancelElem = By.xpath("//*[@id='cancel']");
	
	private By ClickOnFinishElem = By.xpath("//*[@id='finish']");
	
 	public void ClickCancelButton() 
 	{
 	 elem = getWebElement(ClickOnCancelElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickCancelButton");
 
 	 log.info("Click To ClickCancelButton");
 		
 	}
 	
 	public void ClickFinishButton() 
 	{
 	 elem = getWebElement(ClickOnFinishElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickFinishButton");
 
 	 log.info("Click To ClickFinishButton");
 		
 	}

}