package Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import TestScenarioEXec.HeroIAuto;
import utilities.BaseClass;


public class HeroInternetTest extends BaseClass {

	@BeforeTest
	public void inte() {
		driverintiateWeb();
	}

	@AfterTest
	public void closeb() {

		driver.close();
	}

	@Test
	public void Test() {
		HeroIAuto load = new HeroIAuto();
		load.DynamicLoad();
	}
}