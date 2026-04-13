package com.testexecution.test;

import java.io.IOException;


import org.testng.annotations.Test;



import com.baseclass.base.BaseTestPortal;
import com.portalhellomentor.page.Dashboard;
import com.portalhellomentor.page.FeesSeatMatrix;
import com.portalhellomentor.page.LoginPagee;
import com.portalhellomentor.page.OtpPage;
import com.portalhellomentor.page.UniversityInstitute;
import com.portalhellomentor.page.CollegeCompare;
import com.portalhellomentor.page.CollegeRanking;
import com.portalhellomentor.page.Counselling;
import com.portalhellomentor.page.CuttoffAllotment;


public class PortalPage extends BaseTestPortal {
	//Dashboard page
	@Test
	public void DashboardTestCases() throws InterruptedException, IOException {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
	
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp=new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified ");
	
		Dashboard db=new Dashboard(driver);
		db.dashboardmap();
		logger.info("based on rank college filtered successfully");
		db.newsAndRank();
		logger.info("chaeck the news and renk also");

//				
}
	//CutOffAllotments Page
	@Test
	public void toolsTestCases() throws InterruptedException, IOException {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
	
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp=new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified ");
		CuttoffAllotment cutOffAllotmentss =new CuttoffAllotment(driver);
		cutOffAllotmentss.cuttOffAllotmets();
}
	@Test
	public void feeAndSeatMatrix() throws InterruptedException, IOException {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
	
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		FeesSeatMatrix fs=new FeesSeatMatrix(driver);
		fs.feesSeatMatrixs();
}
	@Test
	public void CollegeRanking() throws InterruptedException, IOException {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
	
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		CollegeRanking cg=new CollegeRanking(driver);
		cg.collegeRanking();
}
	@Test
	public void collegeCompareTest() throws InterruptedException, IOException  {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
	
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		CollegeCompare cp=new CollegeCompare(driver);
		cp.compareTheCollege();
}
	@Test
	public void counsellingState() throws InterruptedException, IOException  {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		Counselling cl=new Counselling(driver);
		cl.counselling();
		
}
	@Test
	public void universityinsti() throws InterruptedException, IOException  {
		
		//login page
		LoginPagee prlogin=new LoginPagee(driver);
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		UniversityInstitute ui=new UniversityInstitute(driver);
		ui.universityInstitute();
		
}

	
}








