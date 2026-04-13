package com.hellomentorai.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiscoverPage {

	WebDriver driver;

	public DiscoverPage(WebDriver driver) {
		this.driver = driver;

	}

	By dselement = By.xpath("//p[text()='Discover']");
	By copied = By.xpath(
			"//div[text()='What is the total MBBS seat distribution across India in 2025?']/following::div[1]/*[local-name()='svg']");
	By navigatepage = By.xpath("//h2[text()='5-Year Competition']/following::a[1]");

	public void Discover() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(dselement).click();

		Thread.sleep(4000);

		driver.findElement(copied).click();
		System.out.println("dashboard text copied successfully");
		Thread.sleep(4000);

		driver.findElement(navigatepage).click();
		Thread.sleep(4000);

		driver.navigate().back();

	}

}
