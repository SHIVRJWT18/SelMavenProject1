package SwagLabsTestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import TestPkg.TestBase;
import UtilityPkg.ExcelUtils;


@Test
public class TC02_VerifyHighestPriceForProductWhenHighToLowFilterAppliedForProductSorting extends TestBase
{
	 public String sTestCaseID=null;
	 String[] data=null;
	 String Sheet = null; 
	 
	 private static final Logger log = LogManager.getLogger(TC02_VerifyHighestPriceForProductWhenHighToLowFilterAppliedForProductSorting.class);
	 
	 @Test  
	 public void VerifyHighestPriceForProductWhenHighToLowFilter() throws Exception
	 {
	  sTestCaseID="TC02";
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
      
           prductpage.SelectSortedProductType(data[3]);
           
           log.info("Launch of Sorted Product Page for SwagLabsApp");
           
           prductpage.ExecutionWaitForDriver(3000);
           
           prductpage.GetSortedPriceOfProducts();
           
	 }
	 
    }