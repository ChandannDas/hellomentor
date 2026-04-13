package com.portalhellomentor.page;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;

import java.time.Duration;
import java.util.ArrayList;

import static com.portalhellomentor.page.CounsellingLocator.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Counselling {
	WebDriver driver;
	public Counselling(WebDriver driver) {
		this.driver=driver;
	}
	public void counselling() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(4000);
		WebDriverWait waitblank = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitblank.until(ExpectedConditions.visibilityOfElementLocated(counsellingicon));
		driver.findElement(counsellingicon).click();
		Thread.sleep(3000);
		driver.findElement(clickCounsellingType).click();
		Thread.sleep(2000);
		driver.findElement(selectCstY).click();
		Thread.sleep(2000);
		driver.findElement(clickStateType).click();
		Thread.sleep(2000);
		driver.findElement(selectStTy).click();
		Thread.sleep(2000);
		driver.findElement(clickState).click();
		Thread.sleep(2000);
		driver.findElement(selectState).click();
		Thread.sleep(2000);
//		driver.findElement(searchByCounselling).click();
//		Thread.sleep(2000);
//		driver.findElement(selectByCounselling).click();
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(webSideDeepLink).click();
		Thread.sleep(4000);		
		ArrayList<String> window=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(0));
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		

		


		




		
		
	}

}
