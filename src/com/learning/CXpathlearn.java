package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageFactory.Pagefac;

import utilities.BaseClass;

public class CXpathlearn extends BaseClass{

	public static void main(String[] args) {
		driverintiateWeb();
		driver.get("https://www.rediff.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("mylogin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pwed123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.quit();

		Pagefac fac = new Pagefac();
		PageFactory.initElements(driver,fac);
	    fac.next.click();
	}
	
	public  void fid() {
		
		
	}
	

}
