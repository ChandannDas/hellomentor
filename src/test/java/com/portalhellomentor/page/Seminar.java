package com.portalhellomentor.page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.portalhellomentor.page.SeminarLocator.*;

import java.time.Duration;
import java.util.Random;
public class Seminar {
	
	public WebDriver driver;
	public Seminar(WebDriver driver) {
		this.driver=driver;
	}
	public static String generateRandomMobileNumber() {
	    Random random = new Random();
	    long number = 100000000L + (long)(random.nextDouble()*900000000L);
	    return "9"+number;
	}
	
	public static String generateRandomEmail() {
	    long time = System.currentTimeMillis();
	    return "testuser" + time + "@gmail.com";
	}
	
	public void seminarPage() throws InterruptedException {
		WebDriverWait waiteseminar=new WebDriverWait(driver,Duration.ofSeconds(10));
		waiteseminar.until(ExpectedConditions.presenceOfElementLocated(seminarButton));
		driver.findElement(seminarButton).click();
		Thread.sleep(3000);
//		WebDriverWait waitseminar=new WebDriverWait(driver,Duration.ofSeconds(10));
//		waitseminar.until(ExpectedConditions.presenceOfElementLocated(booknowsem));
		driver.findElement(booknowsem).click();
		driver.findElement(primeNumber).sendKeys("9337823862");
		driver.findElement(next).click();
//		WebDriverWait waittseminar=new WebDriverWait(driver,Duration.ofSeconds(15));
//		waittseminar.until(ExpectedConditions.presenceOfElementLocated(previous));
		Thread.sleep(15000);
		driver.findElement(verify).click();
		String parentNum = generateRandomMobileNumber();
		String emaill = generateRandomEmail();
		Thread.sleep(2000);
		driver.findElement(firstName).sendKeys("test");
		driver.findElement(lastName).sendKeys("test");
		driver.findElement(parentNumber).sendKeys(parentNum);
		driver.findElement(email).sendKeys(emaill);
		driver.findElement(register).click();
	}

}
