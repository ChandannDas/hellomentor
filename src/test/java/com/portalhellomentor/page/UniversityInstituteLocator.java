package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class UniversityInstituteLocator {
	public static By universityInstitute = By
			.xpath("//div[@class='sidebar_side_submenu_active__XoorU']/div[1]/div[6]/h4[1]");
	public static By clickInstituteType = By.xpath("//p[text()='Select Institute Type']");
	public static By selectityInstitute = By.xpath("//p[text()='Deemed']");
	public static By clickUniversity = By.xpath("//p[text()='Select University']");
	public static By selectUniversity = By.xpath("//p[text()='Sri Siddhartha Academy of Higher Education, Tumkur']");

	public static By clickSearchInstitute = By.xpath("//p[text()='Search by Institute']");
	public static By selectSearchInstitute = By
			.xpath("//p[text()='A J Institute of Medical Sciences & Research Centre, Mangalore']");
	public static By deeplink = By.xpath(
			"//div[@class='table-styles_table-overflow__RP893']//table[1]//thead[1]//following::tr[2]/td[6]/a[1]");

}
