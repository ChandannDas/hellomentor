package com.hellomentorai.page;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtpPage {
	WebDriver driver;

	public OtpPage(WebDriver driver) {
		this.driver = driver;
	}

	By otp = By.xpath("//div[@role='button']");
	By nextaipage = By.xpath("//div[@class='ChatNavbar_logo__CuoVZ']/*[local-name()='svg']");

	public boolean otpVarify() throws InterruptedException {
		try {
			Thread.sleep(15000);
			driver.findElement(otp).click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));

			wait.until(ExpectedConditions.visibilityOfElementLocated(nextaipage));

			System.out.println("OTP verified successfully");
			return true;

		} catch (TimeoutException e) {

			System.out.println("OTP verification failed");
			return false;
		}

	}

}
