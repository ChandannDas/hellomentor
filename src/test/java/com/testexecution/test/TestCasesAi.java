package com.testexecution.test;

import java.io.IOException;

import org.testng.annotations.Test;



import com.baseclass.base.BaseTestHellomentorAi;

import com.hellomentorai.page.Aipage;
import com.hellomentorai.page.DiscoverPage;
import com.hellomentorai.page.LoginPage;
import com.hellomentorai.page.OneToOne;
import com.hellomentorai.page.OtpPage;
import com.hellomentorai.page.ReportedForm;
import com.hellomentorai.page.SignUpPage;


public class TestCasesAi extends BaseTestHellomentorAi{

	@Test
	public void ts001() throws InterruptedException, IOException {

		LoginPage login = new LoginPage(driver);
		login.AcceptCokkies();
		login.login();
		System.out.println("click the continue button successfully");
		
		//otp page
		OtpPage op=new OtpPage(driver);
		op.otpVarify();
		
		
		
		//registration page
		
		SignUpPage sn=new SignUpPage(driver);
		sn.fillDetails("test1", "test23", "test@gmail.com");
		System.out.println("Registration successfuly");
		
		//Ai page
		
		
		Aipage ai=new Aipage(driver);
		ai.askquestion();
		System.out.println("ai answer generate successfully");
		
		
		
	}
	
	
     @Test
     public void ts002() throws InterruptedException, IOException {
    	 
    	 //login page(Negetive test cases)

    	 LoginPage login = new LoginPage(driver);
 		login.AcceptCokkies();
 		login.login();
 		System.out.println("login with invalid credential (negetive test cases)");
 		
 		Thread.sleep(2000);
 		System.out.println("login with valid credential(Posißtive test cases)");
 		login.validLogin("9337823862");
 		
 		
 		//login page (Valid TestCases)
 		
 		
 		//otp page
 		OtpPage op=new OtpPage(driver);
 		op.otpVarify();

		//Ai page
		Aipage ai=new Aipage(driver);
		ai.askquestion();
		
		
		//Reported Form 
		ReportedForm dis=new ReportedForm(driver);
	    dis.disLikeForm();
		
        //Discover Page
		DiscoverPage ds=new DiscoverPage(driver);
		ds.Discover();
		
		//one to one secsstion 
		
		OneToOne schedule=new OneToOne(driver);
		schedule.OneToOneSesstion();
			 
     }
}
	
	  
	   



