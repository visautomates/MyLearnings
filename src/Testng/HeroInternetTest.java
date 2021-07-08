package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import TestScenarioEXec.HeroIAuto;
import utilities.BaseClass;


public class HeroInternetTest extends BaseClass {
	


	@BeforeTest
	
	public void inte() throws Exception {
			driverintiateWeb();
		}
	


	@Test
	public void DynamicLoad() {
		HeroIAuto load = new HeroIAuto();
		load.DynamicLoad();
	}
	
	@AfterTest
	public void closeb() {

		driver.close();
	}
}