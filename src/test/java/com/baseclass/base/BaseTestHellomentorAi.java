package com.baseclass.base;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestHellomentorAi {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");

		driver = new ChromeDriver(options);
		// Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://hellomentor.ai/login");
	}

//	@AfterMethod
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='Profile_chevron__QVoJ1']/*[local-name()='svg']")).click();
//        driver.findElement(By.xpath("//p[text()='Logout']")).click();	
//        Thread.sleep(2000);
//        System.out.println("Ai portal logout successfully");
//	}

}
