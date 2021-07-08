package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;

    

	public static void driverintiateWeb() {
		 
			
			ConfigurationReade ConfigurationReade = new ConfigurationReade();
			System.setProperty("webdriver.chrome.driver", ConfigurationReade.getdriverpath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		}
		
	
		
	
	public static void  WaituntilDisplay(WebElement Locator) {
		
	    WebDriverWait  w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(Locator));
		
	}
	
	

}
