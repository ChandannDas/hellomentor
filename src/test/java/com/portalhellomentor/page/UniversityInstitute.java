package com.portalhellomentor.page;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.portalhellomentor.page.UniversityInstituteLocator.*;
public class UniversityInstitute {
	WebDriver driver;
	public UniversityInstitute(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void universityInstitute() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(4000);
		WebDriverWait waitblank = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitblank.until(ExpectedConditions.visibilityOfElementLocated(universityInstitute));
		driver.findElement(universityInstitute).click();
		Thread.sleep(4000);
		driver.findElement(clickInstituteType).click();
		Thread.sleep(2000);
		driver.findElement(selectityInstitute).click();
		driver.findElement(clickUniversity).click();
		Thread.sleep(2000);
		driver.findElement(selectUniversity).click();
		
//		driver.findElement(clickSearchInstitute).click();
//		Thread.sleep(2000);
//
//		driver.findElement(selectSearchInstitute).clear();
		
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(deeplink).click();	
		Thread.sleep(3000);
		ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(0));
		
	}

}
