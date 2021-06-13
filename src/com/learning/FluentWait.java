package com.learning;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.pageFactory.HeroInternet;

import utilities.BaseClass;
import utilities.ConfigurationReade;


public class FluentWait extends BaseClass{
 

	public static void main(String[] args) throws IOException {
		driverintiateWeb();
		
		ConfigurationReade ConfigurationReade = new ConfigurationReade();
		
		driver.get(ConfigurationReade.getherourl());
		HeroInternet herohome = PageFactory.initElements(driver, HeroInternet.class);
	   
	    herohome.getDynamicLoading().click();
	    herohome.getHiddenElementonPage().click();
	    herohome.getHiddenElementonPageClick().click();
	    

        
}

}
