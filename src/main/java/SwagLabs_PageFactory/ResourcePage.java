package SwagLabs_PageFactory;


import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import BasePkg.BasePage;




public class ResourcePage extends BasePage
{
	public ResourcePage (WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement elem;
	
	public List<WebElement> elements;
	
	private static final Logger log = LogManager.getLogger(ResourcePage.class);
			
	private By ClickResourcesElem = By.xpath("(//span[contains(text(),'Resources')])[2]");

	private By ClickSeleniumElem = By.xpath("(//span[contains(text(),'Selenium')])[2]");
	
    private By ClickLogoutElem = By.xpath("//a[@id='logout_sidebar_link']");
    
  	private By ClickResetAppStoreElem = By.xpath("//a[@id='reset_sidebar_link']");
  	
  	private By ClickCartElem = By.xpath("//a[@data-test='shopping-cart-link']");
	
	private By SelectProductSortElem = By.xpath("//select[@data-test='product-sort-container']");
	
 	public void ClickResourcesButton() 
 	{
 	 elem = getWebElement(ClickResourcesElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickResourcesButton");
 
 	 log.info("Click To ClickResourcesButton");
 		
 	}
 	
 	public void ClickSeleniumTab() 
 	{
 	 elem = getWebElement(ClickSeleniumElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickSeleniumTab");
 
 	 log.info("Click To ClickSeleniumTab");
 		
 	}
 	 	
 	public void ClickLogout() 
 	{
 	 elem = getWebElement(ClickLogoutElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickLogoutElem");
 
 	 log.info("Click To ClickLogoutElem");
 		
 	}
 	
 	public void ClickResetAppStore() 
 	{
 	 elem = getWebElement(ClickResetAppStoreElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickResetAppStoreElem");
 
 	 log.info("Click To ClickResetAppStoreElem");
 		
 	}
 	
	public void SelectSortedProductType(String SortProdtype)
	{
	 elem = getWebElement(SelectProductSortElem);
	 
	 sel = new Select(elem);
		
	 sel.selectByVisibleText(SortProdtype);
	 	 	 
	 System.out.println("Selected Product Type is: "+SortProdtype);
		
	 log.info("Select the SortedProductType");		
	}
	
 	public void ClickCartIcon() 
 	{
 	 elem = getWebElement(ClickCartElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickCartIcon");
 
 	 log.info("Click To ClickCartIcon");
 		
 	}
 	
 	public void GetLastPageOfSeleniumPage()
 	{
 	 elements = getWebElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[4]/div/nav/ul/li/button"));	
 	
 	 int Size = elements.size();
 	 
 	 System.out.println("Total Icons Size: " +Size);
 	 
	  String Count = elements.get(Size).getText();
	  
	  System.out.println("The Last Count of Page is: "+Count);	
 	      
     for (int i = 1; i<elements.size()-1; i=i+1) 
     {
      
      String Str = elements.get(i).getText();
      
      System.out.println(Str);  
     }

     
      log.info("Get the last count of Page for About > Resources > Selenium");
 	}
 	

	
}