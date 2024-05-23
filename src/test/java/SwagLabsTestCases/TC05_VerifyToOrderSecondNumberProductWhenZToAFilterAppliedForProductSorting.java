package SwagLabsTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import TestPkg.TestBase;
import UtilityPkg.ExcelUtils;


@Test
public class TC05_VerifyToOrderSecondNumberProductWhenZToAFilterAppliedForProductSorting extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null; 
	 
	 private static final Logger log = LogManager.getLogger(TC05_VerifyToOrderSecondNumberProductWhenZToAFilterAppliedForProductSorting.class);
	 
	 @Test  
	 public void VerifyClientUpdatedBusinessNamefromCompliancetoCrm() throws Exception
	 {
		  sTestCaseID="TC05";
		  Sheet="TestSheet1";
		  data = ExcelUtils.getToReadExcelData(sTestCaseID, Sheet);
			    	
		  SwagLabs_PageFactory.loginpage loginpage = new SwagLabs_PageFactory.loginpage(driver);
		  
		        loginpage.LaunchTheUrl();
		  
	            loginpage.ValidateTheUrl();
	      
	            loginpage.EnterUsername(data[1]);
	      
	            loginpage.EnterPassword(data[2]);
	      
	            loginpage.Click_LoginButton();
	                  
	            log.info("Successfull Launch of Application");
	      
	      SwagLabs_PageFactory.ProductPage prductpage = new SwagLabs_PageFactory.ProductPage(driver);
	      
	            log.info("Launch of Product Page for SwagLabsApp");
	            
	            prductpage.SelectSortedProductType(data[3]);
	            
	            prductpage.ExecutionWaitForDriver(4000);
	            
	            prductpage.AddSortedProductsToCart(2);
	 
	            prductpage.ClickCartIcon();
	             
	            log.info("Launch of Your Cart Page for SwagLabsApp");
	             
	      SwagLabs_PageFactory.YourCartPage yrcartpage = new SwagLabs_PageFactory.YourCartPage(driver);
	            
	            yrcartpage.ClickCheckoutButton();
	            
	            log.info("Launch of CheckoutYourInformation Page for SwagLabsApp");
	             
	      SwagLabs_PageFactory.CheckoutYourInformationPage chkyrinfopage = new  SwagLabs_PageFactory.CheckoutYourInformationPage(driver);      
	             
	            chkyrinfopage.EnterFirstName(data[4]);
	      
	            chkyrinfopage.EnterLastName(data[5]);
	      
	            chkyrinfopage.EnterZip_PostalCode(data[6]);
	           
	            chkyrinfopage.ClickContinueButton();
	            
	            log.info("Launch of CheckoutOverview Page for SwagLabsApp");
	             
	     SwagLabs_PageFactory.CheckoutOverViewPage chkoutOvervwpage = new SwagLabs_PageFactory.CheckoutOverViewPage(driver);      
		
	             chkoutOvervwpage.ClickFinishButton();
	 
	             log.info("Launch of CheckoutComplete Page for SwagLabsApp");
	             
	     SwagLabs_PageFactory.CheckoutCompletePage chkoutcompletepage = new SwagLabs_PageFactory.CheckoutCompletePage(driver);
	 
	             chkoutcompletepage.GetnVerifyValidationMessage(data[7]);
	     
	             chkoutcompletepage.ClickBackHomeButton();
	 
	 
	 
	 }		  

}
