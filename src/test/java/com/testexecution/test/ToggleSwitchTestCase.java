package com.testexecution.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseclass.base.BaseTestPortal;
import com.portalhellomentor.page.LoginPagee;
import com.portalhellomentor.page.OtpPage;
import com.portalhellomentor.page.Toggle;

public class ToggleSwitchTestCase  extends BaseTestPortal{
	@Test
	public void toggleswitchTest() throws InterruptedException, IOException {
		LoginPagee prlogin=new LoginPagee(driver);
		
		prlogin.portallogin("9337823862");
		logger.info("successfully login");
	    //otp page
		OtpPage otp = new OtpPage(driver);
		otp.otpverify();
		logger.info("successfully otp verified");
		
		Toggle tg=new Toggle(driver);
		tg.toggleSwitch();
	}

}
