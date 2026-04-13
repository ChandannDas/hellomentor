
package com.portalhellomentor.page;


import static com.portalhellomentor.page.LoginPageLocator.*;

import org.openqa.selenium.WebDriver;

public class LoginPagee {
	WebDriver driver;
	public LoginPagee(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void portallogin(String number) throws InterruptedException {
		driver.findElement(phonenumber).sendKeys(number);
		driver.findElement(clicklogin).click();
		System.out.println("Navigate to the otp page successfully ");
	}

}
