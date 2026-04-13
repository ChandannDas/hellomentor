package com.portalhellomentor.page;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static com.portalhellomentor.page.DashboardPageLocator.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;

	}

	public void dashboardmap() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		wait.until(ExpectedConditions.visibilityOfElementLocated(booknow));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700);");
//
//		// click safely
		Thread.sleep(2000);
		driver.findElement(dasmap).click();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-700);");
//		
//		//clcik state
		driver.findElement(clickstate).click();
		driver.findElement(enterstate).sendKeys("Karnataka");
		driver.findElement(selectState).click();
//		System.out.println("select the state");
		Thread.sleep(3000);// // select institute type
		driver.findElement(institutetype).click();
		driver.findElement(scinst).click();
		Thread.sleep(3000);
//		// select year
		driver.findElement(selectYear).click();
		driver.findElement(scyear).click();
		Thread.sleep(2000);
//		// select location view
		driver.findElement(locationview).click();
		driver.findElement(sclc).click();

		Thread.sleep(2000);
		JavascriptExecutor mapexe = (JavascriptExecutor) driver;
		mapexe.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		driver.findElement(clgwise).click();

		// Naviate back scroll down up to map
		driver.navigate().back();
//		WebDriverWait waitbook = new WebDriverWait(driver, Duration.ofSeconds(25));
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(booknow));
		Thread.sleep(3000);
		JavascriptExecutor jsdash = (JavascriptExecutor) driver;
		jsdash.executeScript("window.scrollBy(0,500);");
		driver.findElement(yearComparing).click();
		Thread.sleep(2000);
		driver.findElement(offYearComp).click();
		Thread.sleep(2000);
		System.out.println("Dashboard page based on the college ,College got filter Successfully");

	}

	public void newsAndRank() throws InterruptedException {
		// click the dashboard icon ,check news

		JavascriptExecutor jsdash = (JavascriptExecutor) driver;
		jsdash.executeScript("window.scrollBy(0,500);");
//		driver.findElement(dashboard).click();
		Thread.sleep(3000);
		driver.findElement(checkNews).click();
		Thread.sleep(4000);
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(0));
		Thread.sleep(3000);
		System.out.println("Check the updated news");
		// enter Your neet score predict rank
		JavascriptExecutor jsrank = (JavascriptExecutor)driver;
		jsrank.executeScript("window.scrollBy(0,600);");
		driver.findElement(enterNeetScore).sendKeys("560");  
		driver.findElement(clickthePredictRank).click();
		Thread.sleep(2000);
		System.out.println("Check the your rank based on mark");

		// enter your score see the resul
		Thread.sleep(2000);
		driver.findElement(predictRadioBox).click();
		driver.findElement(enterNeetScore).sendKeys("560");
		Thread.sleep(3000);
		driver.findElement(predictscore).click();
		Thread.sleep(2000);
		System.out.println("Check the your score based on mark");
	}

}
