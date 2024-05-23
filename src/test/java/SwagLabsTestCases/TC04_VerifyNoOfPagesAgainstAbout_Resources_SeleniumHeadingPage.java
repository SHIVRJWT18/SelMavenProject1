package SwagLabsTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import TestPkg.TestBase;
import UtilityPkg.ExcelUtils;


@Test
public class TC04_VerifyNoOfPagesAgainstAbout_Resources_SeleniumHeadingPage extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null; 
	 
	 private static final Logger log = LogManager.getLogger(TC04_VerifyNoOfPagesAgainstAbout_Resources_SeleniumHeadingPage.class);
	 
	 @Test  
	 public void VerifyNoOfPagesAgainstAbout_Resources_SeleniumHeading() throws Exception
	 {
	  sTestCaseID="TC04";
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

           prductpage.ClickThreeMenuIcon();
           
           prductpage.ClickAbout();
            
           log.info("Launch of About Page for SwagLabsApp");
            
     SwagLabs_PageFactory.ResourcePage resrcpage = new SwagLabs_PageFactory.ResourcePage(driver);
           
           resrcpage.ClickResourcesButton();
           
           log.info("Launch of Resource Page for SwagLabsApp");
           
           resrcpage.ClickSeleniumTab();
           
           log.info("Launch of Selenium Page for SwagLabsApp");
            
           resrcpage.GetLastPageOfSeleniumPage();
	 }		  
}
