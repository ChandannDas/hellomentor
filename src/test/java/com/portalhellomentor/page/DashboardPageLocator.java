package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class DashboardPageLocator {
	public static By booknow = By.xpath("//p[contains(text(),'Book a session')]/following::button[1]");
	public static By dashboard = By.xpath("//div[@class='mobilenav_firstSectionmenu__qDrVw']/a[1]");
	public static By dasmap = By.xpath("//div[@class='DashboardMap_link__jKhhm']/p");
	public static By clickstate = By.xpath("//p[text()='Select State']");
	public static By enterstate = By.xpath("//input[@placeholder='Search by keyword']");
	public static By selectState = By.xpath("//p[text()='Karnataka']");
	public static By institutetype = By.xpath("//p[text()='Select Institute Type']");
	public static By scinst = By.xpath("//p[text()='Select Institute Type']/following::div[1]/div[3]");
	public static By selectYear = By.xpath("//div[@class='tool-styles_tool-filter-container___ufGh']/div[2]/div[3]");
	public static By scyear = By.xpath("//div[@class='tool-styles_tool-filter-container___ufGh']/div[2]/div[3]/div[2]/div[2]");
	public static By locationview = By.xpath("//div[@class='tool-styles_tool-filter-container___ufGh']/div[2]/div[4]");
	public static By sclc = By.xpath("//div[@class='tool-styles_tool-filter-container___ufGh']/div[2]/div[4]/div[1]/following::div[1]/div[1]");
	public static By clgwise = By.xpath("//p[text()='College Wise']");
	public static By yearComparing = By.xpath("//div[@class='Toggle_toggle-container-dev-off__u4o9C']");
	public static By offYearComp = By.xpath("//div[@class='Toggle_toggle-container-dev-on__h5SGa']");
	public static By checkNews = By.xpath("//div[@class='page_newsupdatesRows__FTueS']/div[1]/div[1]/div[1]/following::div[1]");
	public static By enterNeetScore = By.xpath("//input[@type='number']");
	public static By clickthePredictRank = By.xpath("//button[text()='Predict Rank']");
	public static By predictscore=By.xpath("//button[text()='Predict Score']");
	public static By predictRadioBox = By.xpath("//label[text()='Predict Your Score']");

}
