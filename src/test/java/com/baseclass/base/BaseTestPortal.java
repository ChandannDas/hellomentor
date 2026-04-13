package com.baseclass.base;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;



public class BaseTestPortal {
	public WebDriver driver;
	 public static Logger logger = LogManager.getLogger(BaseTestPortal.class);
	@BeforeMethod
    public void setupp() throws InterruptedException {

    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-extensions");

		  driver = new ChromeDriver(options);
		// Thread.sleep(3000);
		  driver.manage().window().maximize();
		driver.get("https://portal.hellomentor.in/");
		
        Thread.sleep(3000);
        }
}
