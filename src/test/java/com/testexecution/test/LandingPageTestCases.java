package com.testexecution.test;

import org.testng.annotations.Test;



import com.baseclass.base.BaseLandingPage;

import com.portalhellomentor.page.LandingPage;

public class LandingPageTestCases extends BaseLandingPage {
	@Test
	public void books() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.bookkFreeSession();

	}
	@Test
	public void about() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.aboutUs();
	}
	@Test
	public void news() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.newsAndBlog();
	}
	public void hm() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.hmCommunity();
	}
	@Test

	public void refer() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.referAndEarn();
	}
	@Test
	public void mbbs() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.mbbsAbord();
	}
	@Test
	public void patner() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.patnership();
	}
	@Test
	public void carrer() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.carrers();
	}
	@Test
	public void contactUs() throws InterruptedException {
		LandingPage enlg = new LandingPage(driver);
		enlg.contactUs();
	}

}

