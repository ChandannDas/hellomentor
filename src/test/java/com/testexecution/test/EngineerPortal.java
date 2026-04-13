package com.testexecution.test;

import org.testng.annotations.Test;

import com.baseclass.base.BaseEngineering;
import com.hellomentorai.page.EngineeringLogin;
import com.portalhellomentor.page.EngineeringFeesAndSeetMatrixx;
import com.portalhellomentor.page.EnginerringPortal;

public class EngineerPortal extends BaseEngineering {

	@Test(priority = 1)
	public void engineeringTest() throws InterruptedException {
		EngineeringLogin enlg = new EngineeringLogin(driver);
		enlg.engineeringLogin();

		EnginerringPortal enportl = new EnginerringPortal(driver);
		enportl.engineeringPortal();

	}

	@Test (priority = 2)
	public void engineeringfeeTest() throws InterruptedException {
		EngineeringLogin enlg = new EngineeringLogin(driver);
		enlg.engineeringLogin();

		EngineeringFeesAndSeetMatrixx feemt = new EngineeringFeesAndSeetMatrixx(driver);
		feemt.clickFeesAndSeetMatrix();
		feemt.feesMatrix();
		feemt.scrollDown();

	}

}
