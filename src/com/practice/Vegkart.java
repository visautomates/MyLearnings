package com.practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.learning.Selbegin;

import utilities.BaseClass;

public class Vegkart extends BaseClass {

		static String[] itemNeeded = { "Brocolli", "Cauliflower", "Cucumber" };

	public static void main(String[] args) {

		driverintiateWeb();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		ProductAdd();

	}


	public static void ProductAdd() {

		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		for (int i = 0; i < productName.size(); i++) {

			String[] allname = productName.get(i).getText().split("-");
			String formattedName = allname[0].trim();
			System.out.println(formattedName);
			List itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length)
					break;
			}

		}

	}

}

//learnings
// where to place the increment and increment value to be placed before for loop to get it break
//array list have conatins options array dont have 
//array have length method to get size array lisyt have size
//convertingv array to ARRAY LIST using arrays.asList
