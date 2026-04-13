package com.portalhellomentor.page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static com.baseclass.base.BaseTestPortal.*;
import static com.portalhellomentor.page.OtpPageLocator.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtpPage {
	WebDriver driver;

	public OtpPage(WebDriver driver) {
		this.driver = driver;

	}

	public boolean otpverify() throws InterruptedException, IOException {
//		Thread.sleep(10000);
//		driver.findElement(verify).click();
//		Thread.sleep(4000);
//		System.out.println("Otp verify Successfully");
		logger.info("===== Starting OTP Verification =====");

		try {
			logger.info("Waiting for verify button");
			Thread.sleep(10000);
			driver.findElement(verify).click();
			Thread.sleep(4000);
			logger.info("Clicking verify button");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
			wait.until(ExpectedConditions.visibilityOfElementLocated(booknow));
			logger.info("Waiting for dashboard (book now)");
			return true;
		} catch (Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("/Users/chandrakantha/Documents/screen-shot.png"));
//			File f1=(TakesScreenshot)driver.getScreenShotAs(OutputType.FILE);
//			FileUtils.copyFile(f1, new File("/Users/chandrakantha/Documents/screen-shot.png"));

			logger.info("Waiting for dashboard (book now)");
			return false;
		}
	}
}
