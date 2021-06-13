package com.learning;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.BaseClass;

public class DropdownL extends BaseClass {

	public static void main(String[] args) {

		driverintiateWeb();
		url();
		//AD();
		 //vdlist();
		 //checkbox();
		//dateT();
	persons();
		//search();
		//driver.close();

	}
	public static void url() {

	driver.get("https://www.spicejet.com/");
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	}

	public static void AD() {

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
	}

	public static void vdlist() {

		driver.findElement(By.id("autosuggest")).sendKeys("ge");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// ui may take time to load the option
		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for (WebElement option : options) {
			System.out.println(option.getText());// prints value till find germany

			if (option.getText().equalsIgnoreCase("Germany"))
{
				option.click();
				break;
			}
		}
	}

	public static void checkbox() {

		List<WebElement> disfactor = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//List<WebElement> disfactor2 = driver.findElements(By.xpath("//div[@id='discount-checkbox']"));
		System.out.println("number of check box available" + disfactor.size());
		//System.out.println("number of check box available" + disfactor2.size());

		for (WebElement ip : disfactor) {
			System.out.println(ip.getText());
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

	}

	public static void dateT() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}

	}

	public static void persons() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".paxinfo")).click();
		WebElement Stdrp = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdwn = new Select(Stdrp);
		dropdwn.selectByValue("4");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Stdrp2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select dropdwn2 = new Select(Stdrp2);
		dropdwn2.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Stdrp3 = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select dropdwn3 = new Select(Stdrp3);
		dropdwn3.selectByValue("0");
	}

	public static void curr() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement stdn = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dpdn = new Select(stdn);
		dpdn.selectByIndex(3);

	}

	public static void search() {

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}
