package com.ecobiased.qa.swb.testcases.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.contentEquals(actualTitle))
			{
			System.out.println("title matching");
			}
		else
		{
			System.out.println(String.format("title not matching expected is: %s but actual is %s",expectedTitle,actualTitle));
		}
			
		
		driver.quit();
	}

}
