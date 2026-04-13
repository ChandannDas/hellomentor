package com.hellomentorai.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EngineeringLogin {
	WebDriver driver;
	public EngineeringLogin(WebDriver driver){
		this.driver=driver;
		
		}
	
	
	By phonenumber=By.xpath("//input[@placeholder='Enter phone number']");
	By clickLogin=By.xpath("//button[@type='submit']");
	By clickVerify=By.xpath("//button[text()='Verify']");


	public void engineeringLogin() throws InterruptedException {
		driver.findElement(phonenumber).sendKeys("9337823862");
		driver.findElement(clickLogin).click();
			Thread.sleep(15000);
			
		driver.findElement(clickVerify).click();
	    
	}

}
