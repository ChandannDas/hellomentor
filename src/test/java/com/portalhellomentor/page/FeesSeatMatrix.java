package com.portalhellomentor.page;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.blankarea;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;
import static com.portalhellomentor.page.FeesSeatMatrixLocators.*;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeesSeatMatrix {
	WebDriver driver;
	public FeesSeatMatrix(WebDriver driver) {
		this.driver=driver;
	}
	
	public void feesSeatMatrixs() throws InterruptedException {
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitt.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(3000);
		WebDriverWait waitblank = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitblank.until(ExpectedConditions.visibilityOfElementLocated(seatMatrix));
		driver.findElement(seatMatrix).click();
		Thread.sleep(4000);
		driver.findElement(blankarea).click();
		Thread.sleep(3000);
		driver.findElement(clickCourse).click();
		Thread.sleep(2000);
		driver.findElement(selectCourse).click();
		driver.findElement(clickQuota).click();
		Thread.sleep(2000);
		driver.findElement(selectQuota).click();
		driver.findElement(clickInstituteType).click();
		Thread.sleep(2000);
		driver.findElement(selectInstituteType).click();
		driver.findElement(clickCategoery).click();
		Thread.sleep(2000);
		driver.findElement(selectCategoery).click();
		driver.findElement(clickInstitute).click();
		Thread.sleep(2000);
		driver.findElement(selectInstitute).click();
		Thread.sleep(2000);
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		
	}

}
