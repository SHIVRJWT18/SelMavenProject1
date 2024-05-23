package SwagLabsTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import TestPkg.TestBase;
import UtilityPkg.ExcelUtils;


@Test
public class TC03_VerifyErrorNotification_FirstNameisrequired extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null; 
	 
	 private static final Logger log = LogManager.getLogger(TC03_VerifyErrorNotification_FirstNameisrequired.class);
	 
	 @Test  
	 public void VerifyErrorNotification() throws Exception
	 {
	  sTestCaseID="TC03";
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
 
            prductpage.ClickCartIcon();
             
            log.info("Launch of Your Cart Page for SwagLabsApp");
             
      SwagLabs_PageFactory.YourCartPage yrcartpage = new SwagLabs_PageFactory.YourCartPage(driver);
            
            yrcartpage.ClickCheckoutButton();
            
            log.info("Launch of CheckoutYourInformation Page for SwagLabsApp");
             
      SwagLabs_PageFactory.CheckoutYourInformationPage chkyrinfopage = new  SwagLabs_PageFactory.CheckoutYourInformationPage(driver);      
             
            chkyrinfopage.ClickContinueButton();
             
            chkyrinfopage.GetnVerifyErrorMessage(data[3]);
             
	 }		  
}
