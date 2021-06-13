package com.practice;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pageFactory.Demobuttons;

import utilities.BaseClass;


public class DoubleclickActio extends BaseClass{
	
	public static String url = "https://demoqa.com/buttons";
	

	public static void Dobleclick() {
		
     driverintiateWeb();
     driver.get(url);
     
     Actions action = new Actions(driver);
     Demobuttons button = PageFactory.initElements(driver, Demobuttons.class);
   
	 action.doubleClick(button.getdoubleclickMe()).click();
	  
	
		
	}

	

}
