package com.portalhellomentor.page;

import static com.portalhellomentor.page.CollegeCompareLocator.collegeCompare;

import static com.portalhellomentor.page.CollegeRankingLocator.collegeRanking;
import static com.portalhellomentor.page.CounsellingLocator.counsellingicon;
import static com.portalhellomentor.page.CuttoffAllotmentsLocator.toolsicon;
import static com.portalhellomentor.page.DashboardPageLocator.booknow;
import static com.portalhellomentor.page.FeesSeatMatrixLocators.seatMatrix;
import static com.portalhellomentor.page.UniversityInstituteLocator.universityInstitute;

import java.time.Duration;
import static com.portalhellomentor.page.ToggleLocator.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.baseclass.base.BaseTestPortal.*;

public class Toggle {
	WebDriver driver;
	public Toggle(WebDriver driver) {
		this.driver=driver;
	}
	
	public void toggleSwitch() throws InterruptedException {
		WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitt.until(ExpectedConditions.presenceOfElementLocated(booknow));
		driver.findElement(toolsicon).click();
		Thread.sleep(3000);
		driver.findElement(seatMatrix).click();
		Thread.sleep(4000);
		driver.findElement(collegeRanking).click();
		Thread.sleep(4000);
		driver.findElement(collegeCompare).click();
		Thread.sleep(3000);
		driver.findElement(counsellingicon).click();
		Thread.sleep(3000);
		driver.findElement(universityInstitute).click();
		Thread.sleep(4000);
		logger.info(" tools page actions");
		//Click the toggle Functionality 
		driver.findElement(tottleSwitchTo).click();
		Thread.sleep(4000);
		logger.info("click the toggle functionality");
		//Switch TO NEET-PG
		driver.findElement(neetpg).click();
		Thread.sleep(4000);
		logger.info("Switch To NEET-PG");
		
		driver.findElement(toolsicon).click();
		Thread.sleep(4000);
        
		WebDriverWait waitpg=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitpg.until(ExpectedConditions.presenceOfAllElementsLocatedBy(pgfee));
		
		driver.findElement(pgfee).click();
		Thread.sleep(4000);
		driver.findElement(pgseetMatrix).click();
		Thread.sleep(3000);
		driver.findElement(pguniv).click();
		Thread.sleep(3000);
		driver.findElement(pgcollege).click();
		Thread.sleep(3000);
		driver.findElement(pgranking).click();
		
		Thread.sleep(3000);
		logger.info("Pg All tools Action");
		//Switch To NEET-UG
		driver.findElement(tottleSwitchTo).click();
		Thread.sleep(3000);
		logger.info("Click the Toggle button");
		driver.findElement(neetug).click();
		Thread.sleep(5000);
		logger.info("click the neetug button");
        
        //Again action on tools page
		driver.findElement(toolsicon).click();
		Thread.sleep(3000);
		driver.findElement(seatMatrix).click();
		Thread.sleep(4000);
		driver.findElement(collegeRanking).click();
		Thread.sleep(4000);
		driver.findElement(collegeCompare).click();
		Thread.sleep(3000);
		driver.findElement(counsellingicon).click();
		Thread.sleep(3000);
		driver.findElement(universityInstitute).click();
		Thread.sleep(4000);
		logger.info("again tools action in neet ug page");
		
		//Again click the toggle option and click the neetpg button
		
		driver.findElement(tottleSwitchTo).click();
		Thread.sleep(4000);
		driver.findElement(neetpg).click();
		Thread.sleep(3000);
		logger.info("angin switch to Pg");
		
		
		
		
		

 
		

	}
}
