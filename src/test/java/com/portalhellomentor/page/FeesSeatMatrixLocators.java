package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class FeesSeatMatrixLocators {
	//click all dropdowns
	public static By seatMatrix=By.xpath("//div[@class='sidebar_side_submenu_active__XoorU']/div[1]/div[2]/h4[1]");
	public static By clickCourse=By.xpath("//div[@class='tool-styles_dropdown-filter-container__uk0wz']/div[2]");
	public static By clickQuota=By.xpath("//div[@class='tool-styles_dropdown-filter-container__uk0wz']/div[3]");
	public static By clickInstituteType=By.xpath("//div[@class='tool-styles_dropdown-filter-container__uk0wz']/div[4]");
	public static By clickCategoery=By.xpath("//div[@class='tool-styles_dropdown-filter-container__uk0wz']/div[5]");
	public static By clickInstitute=By.xpath("//p[text()='Search by Institute']");

	    //select value in dropdowns
	
	public static By selectCourse=By.xpath("//p[text()='MBBS']");
	public static By selectQuota=By.xpath("//p[text()='All India Quota']");
	public static By selectInstituteType=By.xpath("//p[text()='Government Institute']");
	public static By selectCategoery=By.xpath("//p[text()='OPEN PwD']");
	public static By selectInstitute=By.xpath("//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[4]");


}
