package com.hellomentorai.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneToOne {
	WebDriver driver;
	public OneToOne(WebDriver driver) {
		this.driver=driver;
	}
	
	By onetoonesec=By.xpath("//p[text()='1-to-1 Sessions']");
	By selectcall=By.xpath("//p[text()='On call']");
	By onetoonext=By.xpath("//div[@role='button']");
	By selectdate=By.xpath("//abbr[text()='13']");
	By closebutton=By.xpath("//button[@class='Modal_modal_close__DPGkL']");
	public void OneToOneSesstion() throws InterruptedException {
		
		Thread.sleep(5000);
		
		System.out.println("navigate back from browser");
		
		driver.findElement(onetoonesec).click();
		
		driver.findElement(selectcall).click();
		
		driver.findElement(onetoonext).click();
		
		driver.findElement(selectdate).click();
		
		driver.findElement(closebutton).click();
		Thread.sleep(2000);
		
		System.out.println("1 - 1 to sesstion page executed successfuly");
		
	}

}
