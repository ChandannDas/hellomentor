package com.portalhellomentor.page;


import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;

import java.time.Duration;
import static com.portalhellomentor.page.CollegeRankingLocator.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollegeRanking {
	WebDriver driver;
	public CollegeRanking(WebDriver driver) {
		this.driver=driver;
	}
	public void collegeRanking() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(4000);
		WebDriverWait waitblank = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitblank.until(ExpectedConditions.visibilityOfElementLocated(collegeRanking));
		driver.findElement(collegeRanking).click();
		Thread.sleep(4000);
		driver.findElement(blankRankingPage).click();
		Thread.sleep(4000);
		driver.findElement(clickInstitute).click();
		Thread.sleep(2000);
		driver.findElement(selectInstituteValue).click();
		driver.findElement(clickCourse).click();
		Thread.sleep(2000);
		driver.findElement(selectCourse).click();
		driver.findElement(searchByKeyword).sendKeys("hy");
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}

}
