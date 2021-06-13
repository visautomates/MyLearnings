package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pageFactory.Demobuttons;
import com.practice.*;

import utilities.BaseClass;


public class NewTest extends BaseClass{
  @Test
  public void f() {
	  
	  DoubleclickActio Double = new DoubleclickActio();
	  Double.Dobleclick();
	
	  
  }
  
  @AfterClass
  public void clear() {
	  
	  driver.quit();
	  
	  
  }
}
