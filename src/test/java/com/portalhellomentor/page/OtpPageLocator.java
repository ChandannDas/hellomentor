package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class OtpPageLocator {
	public static By verify=By.xpath("//button[@type='submit']");
	public static By booknow = By.xpath("//p[contains(text(),'Book a session')]/following::button[1]");

}
