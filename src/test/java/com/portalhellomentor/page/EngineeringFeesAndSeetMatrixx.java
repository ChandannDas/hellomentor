package com.portalhellomentor.page;

import static com.portalhellomentor.page.EnginerringFeesAndSeatMatrixLocator.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EngineeringFeesAndSeetMatrixx {
	WebDriver driver;

	public EngineeringFeesAndSeetMatrixx(WebDriver driver) {
		this.driver = driver;
	}

	public void clickFeesAndSeetMatrix() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clickToolsButton));
		Thread.sleep(3000);
		driver.findElement(clickToolsButton).click();
		Thread.sleep(5000);
		WebDriverWait waitcut = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitcut.until(ExpectedConditions.presenceOfElementLocated(feesAndseatMatrix));
		driver.findElement(feesAndseatMatrix).click();
		Thread.sleep(3000);
	}

	public void feesMatrix(By clickLocator, By selectLocator, String name) throws InterruptedException {

		try {
			WebDriverWait waitlo = new WebDriverWait(driver, Duration.ofSeconds(5));

			waitlo.until(ExpectedConditions.elementToBeClickable(clickLocator)).click();
			waitlo.until(ExpectedConditions.elementToBeClickable(selectLocator)).click();

			System.out.println("Selected: " + name);
		} catch (Exception e) {
			System.out.println("Skipped: " + name);
		}
	}
	

	public void feesMatrix() throws InterruptedException {

		feesMatrix(clickState, selectState, "State");

		feesMatrix(clickInstituteType, selectInstitute, "Institute Type");

		feesMatrix(clickEntranceExam, selectEntranceExam, "Entrance Exam");

		feesMatrix(clickDiscipline, selectDiscipline, "Discipline");

		feesMatrix(clickCourseType, selectCourseType, "Course Type");

		feesMatrix(clickBranchName, selectBranchName, "Branch Name");

		feesMatrix(clickQuotas, selectQuoValue, "Quota");

		feesMatrix(clickCategoery, selectCategoery, "Category");

		feesMatrix(clickSeatPools, selectSeatPools, "Seat Pool");
	}
	
	public void scrollDown() {
		JavascriptExecutor exee = (JavascriptExecutor) driver;
		exee.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}

//		Thread.sleep(4000);

//		driver.findElement(clickToolsButton).click();

//		Thread.sleep(3000);

//		WebDriverWait waitcut=new WebDriverWait(driver,Duration.ofSeconds(10));

//		waitcut.until(ExpectedConditions.presenceOfElementLocated(feesAndseatMatrix));

//		driver.findElement(feesAndseatMatrix).click();

//		WebElement range=driver.findElement(rangeSlider);
//		Actions ac=new Actions(driver);

//		ac.clickAndHold(range)
//        .moveByOffset(-100, 0)   // move left (decrease value)cs

//        .release()

//        .perform();

//		System.out.println("drag the element");
		
//		driver.findElement(clickState).click();
//		Thread.sleep(2000);
//		driver.findElement(selectState).click();
//		System.out.println("select state");
		
//		driver.findElement(clickInstituteType).click();
//		Thread.sleep(2000);
//		driver.findElement(selectInstitute).click();
//		System.out.println("select institute type");

//		driver.findElement(clickEntranceExam).click();
//		Thread.sleep(2000);
//		driver.findElement(selectEntranceExam).click();
//		System.out.println("select Entrance Exam");

//		driver.findElement(clickDiscipline).click();
//		Thread.sleep(2000);
//		driver.findElement(selectDiscipline).click();
//		System.out.println("select Discipline");

//		driver.findElement(clickCourseType).click();
//		Thread.sleep(2000);
//		driver.findElement(selectCourseType).click();
//		System.out.println("select course type");

//		driver.findElement(clickBranchName).click();
//		Thread.sleep(2000);
//		driver.findElement(selectBranchName).click();
//		System.out.println("select BranchName");

//		driver.findElement(clickQuotas).click();
//		Thread.sleep(2000);
//		driver.findElement(selectQuoValue).click();
//		System.out.println("select Quote Value");
//
//		driver.findElement(clickCategoery).click();
//		Thread.sleep(2000);
//		driver.findElement(selectCategoery).click();
//		System.out.println("select Categoery");
//
//		driver.findElement(clickSeatPools).click();
//		Thread.sleep(2000);
//		driver.findElement(selectSeatPools).click();
//		System.out.println("select seatPools");
//		
//		JavascriptExecutor exe=(JavascriptExecutor)driver;
//		exe.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	}
//
//}
