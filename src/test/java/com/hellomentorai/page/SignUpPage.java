package com.hellomentorai.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	By lcfirstname=By.xpath("//input[@placeholder='First Name']");
	By lcastname=By.xpath("//input[@placeholder='Last Name']");
	By email=By.xpath("//input[@placeholder='example@gmail.com']");
	By coursetype=By.xpath("//p[text()='Preferred Course Type']/following::select[1]");
	By usertype=By.xpath("//p[text()='User Type']/following::select[1]");
	By discovery=By.xpath("//p[text()='User Discovery']/following::select[1]");
	By location=By.xpath("//span[text()='Select']");
	By selectlocation=By.xpath("//ul[@class='CitySearch_cityList__J994D']/li[1]");
	By submit=By.xpath("//div[@role='button']");
	
	
	public void fillDetails(String firstname,String lastname,String emailid) throws InterruptedException {
		driver.findElement(lcfirstname).sendKeys(firstname);
		driver.findElement(lcastname).sendKeys(lastname);
		driver.findElement(email).sendKeys(emailid);
		new Select(driver.findElement(coursetype)).selectByVisibleText("UG");
		new Select(driver.findElement(usertype)).selectByVisibleText("Student");
		new Select(driver.findElement(discovery)).selectByVisibleText("Other");
		
		//click the location
		driver.findElement(location).click();
		Thread.sleep(3000);
		//select the location
		driver.findElement(selectlocation).click();
		Thread.sleep(3000);
		driver.findElement(submit).click();
		
		Thread.sleep(2000);
		System.out.println("User Register Successfully");
		
		
	}
}


	
	

