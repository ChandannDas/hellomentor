package com.hellomentorai.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Aipage {
	
	WebDriver driver;
	public Aipage(WebDriver driver) {
		this.driver=driver;
	}
	By question=By.xpath("//p[text()='See what people asked recently']/following::div[2]");
	By subquestion=By.xpath("//p[text()='Follow-up']/following::div[1]/div[1]");
	
	
	public void askquestion() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(question).click();
		Thread.sleep(7000);
		driver.findElement(subquestion).click();
		for (int i = 0; i < 6; i++) {
	        
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		}
		
		System.out.println("Ai answer generated successfully");
		Thread.sleep(3000);
		
	}}

