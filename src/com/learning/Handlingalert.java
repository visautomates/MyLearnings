package com.learning;

import org.openqa.selenium.By;
import org.testng.Assert;

import utilities.BaseClass;

public class Handlingalert extends BaseClass {

	public static void main(String[] args) {

		driverintiateWeb();
		alertsp();
		driver.quit();

	}

	public static void alertsp() {

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Vishnu");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println("driver.switchTo().alert().getText()");
		if (driver.switchTo().alert().getText().contains("share your knowledge")) {
			Assert.assertTrue(true);
			System.out.println("executed t1");
		} else {
			Assert.assertTrue(false);
			System.out.println("executed f1");
		}

		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println("driver.switchTo().alert().getText()");
		if (driver.switchTo().alert().getText().contains("you want to confirm?")) {
			Assert.assertTrue(true);
			System.out.println("executed t2");
		} else {
			Assert.assertTrue(false);
			System.out.println("executed f2");
		}
		driver.switchTo().alert().dismiss();
	}

}
