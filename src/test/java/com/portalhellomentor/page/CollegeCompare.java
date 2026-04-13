package com.portalhellomentor.page;

import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;

import java.time.Duration;
import static com.portalhellomentor.page.CollegeCompareLocator.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollegeCompare {
	WebDriver driver;
	public CollegeCompare(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void compareTheCollege() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(3000);
		driver.findElement(collegeCompare).click();
		Thread.sleep(3000);
		driver.findElement(firstAdd).click();
		Thread.sleep(2000);
		driver.findElement(selectFirstAddCollege).click();
		driver.findElement(secondAdd).click();
		Thread.sleep(2000);

		driver.findElement(selectSecondAddCollege).click();
		driver.findElement(thirdAdd).click();
		Thread.sleep(2000);

		driver.findElement(selectThirdAddCollege).click();
		driver.findElement(fourdAdd).click();
		Thread.sleep(2000);

		driver.findElement(selectFourAddCollege).click();
		driver.findElement(remove).click();
		
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
