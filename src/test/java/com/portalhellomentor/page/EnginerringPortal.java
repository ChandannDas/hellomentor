package com.portalhellomentor.page;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;
import static com.portalhellomentor.page.EngineeringPortalLocator.*;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnginerringPortal {
	WebDriver driver;
	public EnginerringPortal (WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void engineeringPortal() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(booknow));
		Thread.sleep(3000);
		
		driver.findElement(clickToolsButton).click();
		Thread.sleep(3000);
		
		WebDriverWait waitcut=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitcut.until(ExpectedConditions.presenceOfElementLocated(clickCutOfAllotments));
		driver.findElement(clickCutOfAllotments).click();
		Thread.sleep(4000);
		
		WebElement range=driver.findElement(rangeSlider);
		Actions ac=new Actions(driver);
		ac.clickAndHold(range)
        .moveByOffset(-100, 0)  // move left (decrease value);
        .release()
        .perform();
		System.out.println("drag the element");
		
		driver.findElement(clickState).click();
		Thread.sleep(2000);
		driver.findElement(selectState).click();
		System.out.println("select state");
		
		driver.findElement(clickInstituteType).click();
		Thread.sleep(2000);
		driver.findElement(selectInstitute).click();
		System.out.println("select institute type");

		driver.findElement(clickEntranceExam).click();
		Thread.sleep(2000);
		
		driver.findElement(selectEntranceExam).click();
		System.out.println("select Entrance Exam");
		Thread.sleep(2000);
		
		driver.findElement(clickDiscipline).click();
		Thread.sleep(2000);
		
		driver.findElement(selectDiscipline).click();
		System.out.println("select Discipline");
		Thread.sleep(2000);
		
		driver.findElement(clickCourseType).click();
		Thread.sleep(2000);
		
		driver.findElement(selectCourseType).click();
		System.out.println("select course type");
		Thread.sleep(2000);
		
		driver.findElement(clickBranchName).click();
		Thread.sleep(2000);
		
		driver.findElement(selectBranchName).click();
		System.out.println("select BranchName");
		Thread.sleep(2000);
		
		driver.findElement(clickQuotas).click();
		Thread.sleep(2000);
		
		driver.findElement(selectQuoValue).click();
		System.out.println("select Quote Value");
		Thread.sleep(2000);
		
		driver.findElement(clickCategoery).click();
		Thread.sleep(2000);
		
		driver.findElement(selectCategoery).click();
		System.out.println("select Categoery");
		Thread.sleep(2000);
		
		driver.findElement(clickSeatPools).click();
		Thread.sleep(2000);
		
		driver.findElement(selectSeatPools).click();
		System.out.println("select seatPools");
		
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
