package SwagLabs_PageFactory;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePkg.BasePage;




public class ProductPage extends BasePage
{
	public ProductPage (WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement elem;
	
	public List<WebElement> elements;
	
	private static final Logger log = LogManager.getLogger(ProductPage.class);
			
	private By ThreeMenuIconElem = By.xpath("//button[@id='react-burger-menu-btn']");

	private By ClickCrossIconElem = By.xpath("//button[@id='react-burger-cross-btn']");

	private By ClickAboutElem = By.xpath("//a[@id='about_sidebar_link']");
	
    private By ClickLogoutElem = By.xpath("//a[@id='logout_sidebar_link']");
    
  	private By ClickResetAppStoreElem = By.xpath("//a[@id='reset_sidebar_link']");
  	
  	private By ClickCartElem = By.xpath("//a[@data-test='shopping-cart-link']");
	
	private By SelectProductSortElem = By.xpath("//select[@data-test='product-sort-container']");
	
	
	
 	public void ClickThreeMenuIcon() 
 	{
 	 elem = getWebElement(ThreeMenuIconElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ThreeMenuIconElem");
 
 	 log.info("Click To ThreeMenuIconElem");
 		
 	}
 	
 	public void ClickCrossIcon() 
 	{
 	 elem = getWebElement(ClickCrossIconElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickCrossIconElem");
 
 	 log.info("Click To ClickCrossIconElem");
 		
 	}
 	
 	public void ClickAbout() 
 	{
 	 elem = getWebElement(ClickAboutElem);
 		
 	 elem.click();
     
 	 System.out.println("Click To ClickAboutElem");
 
 	 log.info("Click To ClickAboutElem");
 		
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
 	
 	public void GetSortedPriceOfProducts()
 	{
 	 elements = getWebElements(By.xpath("//*[@id='inventory_container']/div/div/div[2]/div[2]/div"));	
 	
 	 int Size = elements.size();
 	 
 	 System.out.println("Total Products Size: " +Size);
 	 
     ArrayList<Float> priceList = new ArrayList<Float>();
     
     for (int i = 0; i<elements.size(); i=i+1) 
     {

    	String str = elements.get(i).getText().replaceAll("[$,]", "");
    	    	 
        priceList.add(Float.parseFloat(str)); 
        
        System.out.println(str);
     }  
     if(!ascendingCheck(priceList))
     {
        // Assert.fail("Not is ascending order");
     } 
     
     log.info("GetSortedPriceOfProducts - Highest Price");
 	}
 	
    Boolean ascendingCheck(ArrayList<Float> data)
    {         
     for (int i = 0; i < data.size()-1; i++) 
     {
      if (data.get(i) > data.get(i+1))    	  
      {
       System.out.println("The Largest price of Product is: "+ data.get(i));
                
       return false;
      }       
     }    
     return true;
    }
    
 	public void AddSortedProductsToCart(int i)
 	{
 	 elements = getWebElements(By.xpath("//button[contains(text(),'Add to cart')]"));	
 	
 	 int Size = elements.size();
 	 
 	 System.out.println("Total Products Size: " +Size);
 	 
 	 if((0<i) && (i<Size))
 	 {	 	 
 	 elem = getWebElement(By.xpath("(//button[contains(text(),'Add to cart')])["+i+"]"));	

     elem.click();
 	 }
 	 else
 	 {
      Assert.fail("Invalid Input");
 	 }	 
 		
 	 log.info("Second Name (Z to A) Sorted Product added in Cart");
    }
    
  
 	
 	

	
}