package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class ImandExpWait extends BaseClass {
	
	static WebDriverWait W = new WebDriverWait(driver,5);

	public static void main(String[] args) {
		
		driverintiateWeb();
	
		WebElement j = driver.findElement(By.xpath(""));
		W.until(ExpectedConditions.visibilityOf(j));

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
