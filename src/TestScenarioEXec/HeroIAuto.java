package TestScenarioEXec;

import org.openqa.selenium.support.PageFactory;

import com.pageFactory.HeroInternet;

import utilities.BaseClass;
import utilities.ConfigurationReade;

public class HeroIAuto extends BaseClass {

	public static void DynamicLoad() {

		ConfigurationReade ConfigurationReade = new ConfigurationReade();

		driver.get(ConfigurationReade.getherourl());
		HeroInternet herohome = PageFactory.initElements(driver, HeroInternet.class);

		herohome.getDynamicLoading().click();
		herohome.getHiddenElementonPage().click();
		herohome.getHiddenElementonPageClick().click();
		WaituntilDisplay(herohome.getHiddenElementDisp());
		if (herohome.getHiddenElementDisp().getText().contains("Hello World!")) {
			System.out.println(herohome.getHiddenElementDisp().getText());
		} else {
			System.out.println("result changed please verify");
		}

	}
}
