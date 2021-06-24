package hcl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
	static WebDriver driver;

	public static void main(String args[]) {

		driverintiate();
		returnorder("1257945872");

	}

	public static void driverintiate() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://return-order-app.herokuapp.com/");
		driver.manage().window().maximize();

	}

	public static void returnorder(String OrderNumber) {

		driver.findElement(By.xpath("//input[@id='order-id']")).sendKeys(OrderNumber);
		driver.findElement(By.xpath("//button[text()='Find Order']")).click();
		driver.findElement(By.xpath("//button[text()='Return This Product']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String text = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'output')]")))
				.getText();
		
		driver.close();

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("D:\\Viz\\Git Automation Repo\\selenium\\src\\hcl\\result.txt");
			bw = new BufferedWriter(fw);

			bw.write(text);

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					bw.flush();
					bw.close();
					fw.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

		}
	}

}
