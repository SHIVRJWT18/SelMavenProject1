package UtilityPkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ClosePopup {

	public ClosePopup(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
		}



		public static boolean ValidateAndPopUp(WebDriver driver)
		{
		boolean data=false;
		try
		{
		Thread.sleep(5000);//*[@id="c8097a60-d739-7c08-3ea4-71b038515d0d"]
		//WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));
		//WebElement ele = driver.findElement(By.xpath("//*[@id='5b258dc2-c6ff-42aa-8c2b-754a39b6b7ae']"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='5facd706-e419-0461-1d50-34ae77200ff7']"));
		//WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));
		// WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
		// WebElement ele = driver.findElement(By.xpath("//*[@id='72006fc1-1c44-403e-a8f8-af3bbec4d50e']"));
		// WebElement ele = driver.findElement(By.xpath("//*[@id='38c74b6b-246d-4be9-ba18-a7bd3e5e29a9']"));

		WebDriverWait wait = new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.visibilityOf(ele1));
		ele1.click();
		System.out.println(true);
		return true;
		} catch (Exception e)
		{
		System.out.println(false);
		return data;
		}

		}

		public static boolean ValidateAndPopUp1(WebDriver driver)
		{
		boolean data=false;
		try
		{
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='5facd706-e419-0461-1d50-34ae77200ff7']"));
		// WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));

		WebDriverWait wait = new WebDriverWait(driver, null);
		wait.until(ExpectedConditions.visibilityOf(ele1));
		ele1.click();
		System.out.println(true);
		return true;
		} catch (Exception e)
		{
		System.out.println(false);
		return data;
		}

		}
		
		
	}


