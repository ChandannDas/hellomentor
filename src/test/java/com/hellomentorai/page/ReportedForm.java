package com.hellomentorai.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportedForm {
	WebDriver driver;
	public ReportedForm(WebDriver driver) {
		this.driver=driver;
		}
	
	By dislikeForm=By.xpath("//div[@class='MessageActions_mainContainer__3gAok']/div[4]");
	By selectIsuueType=By.xpath("//div[@class='DropdownComponent_trigger__zL6q3']");
	By selecIssues=By.xpath("//ul[@class='DropdownComponent_menu__GNQut']/li[6]");
    By uploadIssuesImage=By.id("error-file-upload");
    By issueDes=By.xpath("//textarea[@placeholder='Type here...']");
    By starRate=By.xpath("//div[@class='FeedbackForm_rating_section__jfEYH']/div[1]/div[4]");
    By submitIssuesForm=By.xpath("//div[text()='Submit']");
    By dselement = By.xpath("//p[text()='Discover']");
    By header=By.xpath("//h4[text()='Spotted an Issue?']");
    public void disLikeForm() throws InterruptedException {
    	WebDriverWait waitdri=new WebDriverWait(driver,Duration.ofSeconds(5));
    	waitdri.until(ExpectedConditions.visibilityOfElementLocated(dislikeForm));
    	driver.findElement(dislikeForm).click();
//    	WebDriverWait waitdri=new WebDriverWait(driver,Duration.ofSeconds(5));
//    	waitdri.until(ExpectedConditions.visibilityOfElementLocated(header));
    	driver.findElement(selectIsuueType).click();
    	driver.findElement(selecIssues).click();
    	Thread.sleep(4000);
    	WebElement uploadFile=driver.findElement(uploadIssuesImage);
    	uploadFile.sendKeys("/Users/chandrakantha/Desktop/image.png");
    	
    	driver.findElement(issueDes).sendKeys("test analysis");
    	driver.findElement(starRate).click();
    	driver.findElement(submitIssuesForm).click();
    	
    	Thread.sleep(3000);
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(dselement));
    	
    	Thread.sleep(5000);
    	System.out.println("Issue Reported successfully");
    }
	
	}
