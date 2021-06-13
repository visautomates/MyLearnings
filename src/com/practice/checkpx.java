package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkpx {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		
		
		Inti();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Chkf();
		//allbx();
		

	}
	
	public static void Inti() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	public static void Chkf() {
		
		WebElement firstop = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		firstop.click();
		Assert.assertTrue(firstop.isSelected());
		firstop.click();
		Assert.assertFalse(firstop.isSelected());
		//Assert.assertTrue(firstop.isDisplayed());//can be used 
		}
	public static void allbx() {
		
		List<WebElement> op = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
			
	
			System.out.println("number of check box"+ op.size());
		
		
		
	}

}
