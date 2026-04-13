package com.baseclass.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseLandingPage {
	public WebDriver driver;

	@BeforeMethod
	public void setuplanding() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);
		// Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://hellomentor.in/");
	

	

	}
}
