package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class copied {
	 static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\java\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();//select checkbox 1
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());//validated checkbox selection
        
        //Thread.sleep(4000);//delay process to see the check and uncheck activity

        driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();//deselect checkbox 1
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());//validated checkbox deselection
        
        //to get checkbox counts on the page.
        System.out.println("The checkbox count is "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());//select checkbox 1

    }

}

