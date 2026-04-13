package com.portalhellomentor.page;

import org.openqa.selenium.By;

public class LandingPageLocator {
	public static By cookies =By.id("accept_all");
	public static By bookfreeSession=By.xpath("//button[@id='home-landingsection-booksession']");
	public static By freeSessionFormUg=By.xpath("//p[text()='UG']");

	public static By clickName=By.xpath("//input[@placeholder='Enter Name']");
	public static By EnterNumber=By.xpath("//input[@type='tel']");
	public static By clickMail=By.xpath("//input[@name='email']");
	public static By clickState=By.xpath("//input[@placeholder='Select State']");
	public static By selectState=By.xpath("//p[text()='Karnataka']");
	public static By selectRadioButton=By.xpath("//input[@value='On Call']");
	public static By clickNextButton=By.xpath("//button[@type='submit']");
	public static By clickVerifyButton=By.xpath("//button[text()='Verify']");
	public static By selectDate=By.xpath("//div[@class='react-calendar__month-view__days']/button[9]");
	public static By clickSubmitButton=By.id("pg-submit-booksession");
	public static By clickCancelButton=By.xpath("//div[@class='bookmodal_btn_close___Dmz_c']");
	
	
	public static By clickMoreButton=By.xpath("//span[text()='More']");
	public static By clickAboutButton=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[1]");
	public static By clickNewsBlog=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[2]");
	public static By clickHmCommunity=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[3]");
	public static By clickReferAndEarn=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[4]");
	public static By clickMbbsAbroad=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[5]");
	public static By clickPartnership=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[6]");
	public static By clickCarrer=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[7]");
	public static By clickContactUs=By.xpath("//div[@class='routesComponent_desktop_dropdown_content__XBO8h']/a[8]");
	public static By clickreferEarnButton=By.id("referandearn-heartopsection-refernow");
	public static By cancelRefer=By.xpath("//div[@class='ReferAndEarnModal_closeBtn__Jon42']");

	
	
	public static By studentDetailsEnterName=By.xpath("//input[@placeholder ='Enter Name']");
	public static By studentDetailsEnterStNum=By.xpath("//label[text()='Student Mobile Number *']/following::div[1]/input[1]");
    public static By studentDetailsEnterPrNum=By.xpath("//label[text()='Parent Mobile Number (Optional)']/following::div[1]/input[1]");
	public static By studentDetailsReferNow=By.xpath("//button[text()='Refer Now']");
	
	
	public static By yourDetailsName=By.xpath("//input[@placeholder='Enter Your Name']");
	public static By yourDetailsEmail=By.xpath("//input[@placeholder='Enter Your Mail']");
	public static By yourDetailsNumber=By.xpath("//input[@placeholder='Enter Phone Number']");
	public static By termAndConditions=By.xpath("//input[@type='checkbox']");
	public static By clickSubMitButtton=By.xpath("//button[text()='Submit']");
	
	public static By successfully=By.xpath("//h2[text()='Referred Successfully!']");
	
	
	//every page titile
	public static By aboutTitle=By.xpath("//div[@class='header_navbar_brand__syD_Y']");
	public static By hm=By.xpath("//span[text()='NEET Updates']");

	public static By mbbs=By.xpath("//h2[text()='World-Class Counselling for ']");
	public static By patner=By.xpath("//h2[text()='A Big Dream Needs A ']");
	public static By carrerloc=By.xpath("//h1[text()='Become a part of']");
	public static By contactus=By.xpath("//h1[text()='Contact. Connect. ']");

	
	
	//public static By refernow=By.id("referandearn-heartopsection-refernow");
	public static By relatioDropdown=By.xpath("//label[text()='How do you know the student? *']/following-sibling::select");

    
	public static By referedSuccessfully=By.xpath("//h2[text()='Referred Successfully!']");



    //contact us page
	public static By name=By.xpath("//input[@placeholder='Name']");
	public static By number=By.xpath("//input[@type='tel']");
	public static By mail=By.xpath("//input[@name='email']");
	public static By driopdownvalue=By.xpath("//select[@name='esclation']");
	public static By textarea=By.xpath("//textarea[@name='Description']");
	public static By submitContactUS=By.id("contactus-getintouch-submitcontact");





	


}
