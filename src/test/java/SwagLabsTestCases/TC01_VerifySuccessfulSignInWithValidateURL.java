package SwagLabsTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import TestPkg.TestBase;
import UtilityPkg.ExcelUtils;


@Test
public class TC01_VerifySuccessfulSignInWithValidateURL extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null; 
	 
	 private static final Logger log = LogManager.getLogger(TC01_VerifySuccessfulSignInWithValidateURL.class);
	 
	 @Test  
	 public void VerifySuccessfulSignIn() throws Exception
	 {
	  sTestCaseID="TC01";
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
       
            prductpage.ExecutionWaitForDriver(2500);
		    
            prductpage.ClickThreeMenuIcon();
		    
            prductpage.ClickLogout();
		     



                           
	 }		  
}
