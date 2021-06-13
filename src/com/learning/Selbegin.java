package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BaseClass;
import utilities.ConfigurationReade;

public class Selbegin extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		//driverintiate();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='SDkEP']/div[2]/input")).sendKeys("what the hell man");
		driver.findElement(By.xpath("//*[@class='mus_il']")).click();
		driver.findElement(By.xpath("//*[@class='tsf']/div[2]/div/div[3]/center/input")).click();

	}
	/*
	 * public static void driverintiate() { ConfigurationReade ConfigurationReade =
	 * new ConfigurationReade();
	 * 
	 * System.setProperty("webdriver.chrome.driver",ConfigurationReade.getdriverpath
	 * () ); driver = new ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 * 
	 * String Title = driver.getTitle();
	 * driver.navigate().to("https://www.youtube.com/"); driver.navigate().back();
	 * driver.close(); System.out.println(Title);
	 * 
	 * 
	 * }
	 */
}
