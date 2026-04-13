package com.portalhellomentor.page;

import static com.portalhellomentor.page.DashboardPageLocator.booknow;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.*;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CuttoffAllotment {
	public WebDriver driver;

	public CuttoffAllotment(WebDriver driver) {
		this.driver = driver;
	}

	public void cuttOffAllotmets() throws InterruptedException {
//		driver.findElement(navbar).click();
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitt.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(3000);
		WebDriverWait waitblank = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitblank.until(ExpectedConditions.visibilityOfElementLocated(blankarea));
		driver.findElement(blankarea).click();
		Thread.sleep(4000);
		driver.findElement(clickState).click();
		driver.findElement(clicksearchstate).sendKeys("karnatak");
		Thread.sleep(2000);
		driver.findElement(selectState).click();
		System.out.println("select state value");
		driver.findElement(clickDegree).click();
		driver.findElement(selectDegree).click();
		System.out.println("select Degree value");
		driver.findElement(clickQuota).click();
		driver.findElement(selectQuota).click();
		System.out.println("select Quota value");
		driver.findElement(clickInstituteType).click();
		driver.findElement(selectInstituteType).click();
		System.out.println("select Institute value");
		Thread.sleep(2000);
		driver.findElement(clickCategoery).click();
		Thread.sleep(2000);
		driver.findElement(selectCategoery).click();
		Thread.sleep(4000);
		System.out.println("select Categoery value");
		driver.findElement(searchInstituteType).click();
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(selectSearchInstituteType).click();
		driver.findElement(blankarea).click();
		System.out.println("check the college based on your filter");

	}

}
