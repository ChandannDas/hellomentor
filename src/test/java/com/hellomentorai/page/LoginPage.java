package com.hellomentorai.page;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By cookies =By.id("accept_all");
	public void AcceptCokkies() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(cookies)).click();
		System.out.println("cookies handle successfully");
	}
	
	
	By numberinputbox=By.id("phone_number");
	By continuebutton=By.xpath("//div[@role='button']");
	By backtologin=By.xpath("//div[@class='BackButton_container__HhMKl']");
	public void login() throws InterruptedException, IOException {
		Thread.sleep(3000);
		
		String logindata ="/Users/chandrakantha/Desktop/credential.xlsx";
		FileInputStream file =new FileInputStream(logindata);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		
		DataFormatter formatter = new DataFormatter();
		
		int row=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<row;i++) {
			XSSFRow rowc=sheet.getRow(i);
			
			String username = formatter.formatCellValue(rowc.getCell(0));
			
			driver.findElement(numberinputbox).clear();
			driver.findElement(numberinputbox).sendKeys(username);
			driver.findElement(continuebutton).click();
            
            
			Thread.sleep(5000);
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(numberinputbox));
		    
		}
		wb.close();
		file.close();
	
	}
	
	public void validLogin(String number) throws InterruptedException {
		driver.findElement(numberinputbox).sendKeys(number);
		driver.findElement(continuebutton).click();
		Thread.sleep(5000);
		}
	

}
