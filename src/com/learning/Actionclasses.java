package com.learning;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pageFactory.AmazonPage;

import utilities.BaseClass;
import utilities.ConfigurationReade;

public class Actionclasses extends BaseClass{

	public static void main(String[] args) {
		
		driverintiateWeb();
		ConfigurationReade Reader = new ConfigurationReade();
		driver.get(Reader.getAmazon());
		Actions action = new Actions(driver) ;
		AmazonPage aZpg = new PageFactory().initElements(driver, AmazonPage.class);
		//action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2'])2"))).build().perform();
		action.moveToElement(aZpg.getHelloSig()).build().perform();
		
	}

}
