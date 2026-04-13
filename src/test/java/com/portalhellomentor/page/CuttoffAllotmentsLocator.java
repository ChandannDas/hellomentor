package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class CuttoffAllotmentsLocator {
	
	public static By header=By.xpath("//div[@class='ToolHeader_--pl-tool-header-container__F2_tg']/h3[1]");
	public static By toolsicon=By.xpath("//div[@class='sidebar_sidebar_section_parent__LMVcG']/div[1]/div[3]//*[local-name()='path']");
	public static By blankarea=By.xpath("//div[@class='tool-styles_tool-container__Ukxis']");
	public static By clickState=By.xpath("//p[text()='Select State']");
	public static By clicksearchstate=By.xpath("//input[@placeholder='Search by keyword']");
	public static By clickDegree=By.xpath("//p[text()='Select Degree']");
	public static By clickQuota=By.xpath("//p[text()='Select Quota']");
	public static By clickInstituteType=By.xpath("//p[text()='Select Institute Type']");
	public static By clickCategoery=By.xpath("//p[text()='Select Category']");


   //select sstate
	public static By selectState=By.xpath("//p[text()='Karnataka']");
	public static By selectDegree=By.xpath("//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[4]");
	public static By selectQuota=By.xpath("//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[2]");
	public static By selectInstituteType=By.xpath("//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[1]");
	public static By selectCategoery=By.xpath("//p[text()='OPEN']");
    public static By searchInstituteType=By.xpath("//p[text()='Search by Institute']");
    public static By selectSearchInstituteType=By.xpath("//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[4]");

	//div[@class='SeatMatrixFilter_--pl-filter-dd-dropdown-container__hUBpU']/div[6]

}
