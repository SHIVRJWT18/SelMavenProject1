package SwagLabs_PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePkg.BasePage;




public class YourCartPage extends BasePage
{
	 

	public YourCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private static final Logger log = LogManager.getLogger(YourCartPage.class);

	private By ClickOnRemoveElem = By.xpath("//*[@id='remove-sauce-labs-backpack']");
	
	private By ClickOnContinueShoppingElem = By.xpath("//*[@id='continue-shopping']");

	private By ClickOnCheckoutElem = By.xpath("//*[@id='checkout']");
	

 	public void ClickRemoveButton() 
 	{
 	 elem = getWebElement(ClickOnRemoveElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickRemoveButton");
 
 	 log.info("Click To ClickRemoveButton");
 		
 	}
 	
 	public void ClickContinueShoppingButton() 
 	{
 	 elem = getWebElement(ClickOnContinueShoppingElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickContinueShoppingButton");
 
 	 log.info("Click To ClickContinueShoppingButton");
 		
 	}
 	
 	public void ClickCheckoutButton() 
 	{
 	 elem = getWebElement(ClickOnCheckoutElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickCheckoutButton");
 
 	 log.info("Click To ClickCheckoutButton");
 		
 	}
	
	

	
	
}