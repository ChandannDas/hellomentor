package com.portalhellomentor.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.portalhellomentor.page.LandingPageLocator.*;

import java.time.Duration;
import java.util.Random;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void bookkFreeSession() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement bookfree = wait.until(ExpectedConditions.presenceOfElementLocated(bookfreeSession));
		bookfree.click();
		driver.findElement(cookies).click();
		driver.findElement(clickName).sendKeys("test");
		driver.findElement(EnterNumber).sendKeys("9337823862");
		driver.findElement(clickMail).sendKeys("test@gmail.com");
		driver.findElement(clickState).click();
		driver.findElement(selectState).click();
		driver.findElement(selectRadioButton).click();
		driver.findElement(clickNextButton).click();
		Thread.sleep(10000);
		driver.findElement(clickVerifyButton).click();
		System.out.println("otp verified successfully");
		WebDriverWait waitform = new WebDriverWait(driver, Duration.ofSeconds(10));
		 waitform.until(ExpectedConditions.visibilityOfElementLocated(selectDate));
		driver.findElement(selectDate).click();

		driver.findElement(clickSubmitButton).click();
		driver.findElement(clickCancelButton).click();
		Thread.sleep(2000);
		System.out.println("book free session booked successfully");
	}

	public void aboutUs() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions ac = new Actions(driver);

		WebElement more = driver.findElement(clickMoreButton);

		// About us session

		ac.moveToElement(more).perform();
		Thread.sleep(2000);

		WebDriverWait section = new WebDriverWait(driver, Duration.ofSeconds(4));
		section.until(ExpectedConditions.visibilityOfElementLocated(clickAboutButton));
		driver.findElement(clickAboutButton).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(aboutTitle));
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("About Us page Navigate Properly");
		Thread.sleep(3000);
		
	}
		// News&Blogs
	public void newsAndBlog() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions acnews = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		acnews.moveToElement(more).perform();
		Thread.sleep(2000);
		WebDriverWait sectionNews = new WebDriverWait(driver, Duration.ofSeconds(4));
		sectionNews.until(ExpectedConditions.visibilityOfElementLocated(clickNewsBlog));
		driver.findElement(clickNewsBlog).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(aboutTitle));
		driver.navigate().back();
		System.out.println("NewsAndBlog page Navigate Properly");
	}
	public void hmCommunity() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions achm = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		achm.moveToElement(more).perform();
		Thread.sleep(2000);
		WebDriverWait sectionHm = new WebDriverWait(driver, Duration.ofSeconds(4));
		sectionHm.until(ExpectedConditions.visibilityOfElementLocated(clickHmCommunity));
		driver.findElement(clickHmCommunity).click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(hm));
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("HM Community page Navigate Properly");
	

	}
	public static String generateRandomMobileNumber() {
	    Random random = new Random();
	    long number = 100000000L + (long)(random.nextDouble()*900000000L);
	    return "9"+number;
	}
	
	public void referAndEarn() throws InterruptedException {
		WebDriverWait insisdeRefer = new WebDriverWait(driver, Duration.ofSeconds(15));
		Actions acref = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		acref.moveToElement(more).perform();
		Thread.sleep(2000);
		WebDriverWait sectionRefer = new WebDriverWait(driver, Duration.ofSeconds(4));
		sectionRefer.until(ExpectedConditions.visibilityOfElementLocated(clickReferAndEarn));
		driver.findElement(clickReferAndEarn).click();
		System.out.println("click the refer and earn button");
		//studen details
		
		insisdeRefer.until(ExpectedConditions.visibilityOfElementLocated(clickreferEarnButton));
	    
		String studentNum = generateRandomMobileNumber();
		String parentNum = generateRandomMobileNumber();
		String yourNum = generateRandomMobileNumber();
		
		driver.findElement(clickreferEarnButton).click();
		Thread.sleep(2000);
		driver.findElement(studentDetailsEnterName).sendKeys("test");
		driver.findElement(studentDetailsEnterStNum).sendKeys(studentNum);
		driver.findElement(studentDetailsEnterPrNum).sendKeys(parentNum);
		Thread.sleep(2000);
		
		WebElement eledrop=driver.findElement(relatioDropdown);
		Select sc=new Select(eledrop);
		sc.selectByContainsVisibleText("Close Friend");
		Thread.sleep(2000);
		driver.findElement(studentDetailsReferNow).click();
		System.out.println("fillup the student details successfully");
		//your details
		driver.findElement(yourDetailsName).sendKeys("test test");
		driver.findElement(yourDetailsEmail).sendKeys("test@gmail.com");
		driver.findElement(yourDetailsNumber).sendKeys(yourNum);
		driver.findElement(termAndConditions).click();
		driver.findElement(clickSubMitButtton).click();
		System.out.println("fillup the your details successfully");
		
		//Successfully messege
		WebDriverWait refer=new WebDriverWait(driver,Duration.ofSeconds(4));
		WebElement re=refer.until(ExpectedConditions.visibilityOfElementLocated(referedSuccessfully));
		
		String msg=re.getText();
		if(msg.equals("Referred Successfully!")) {
			System.out.println("refered successfully");
		}else {
			System.out.println("refered not successfully");

		}
		Thread.sleep(3000);
		driver.findElement(cancelRefer).click();
		Thread.sleep(4000);
	
	}
	
	public void mbbsAbord() throws InterruptedException {
		WebDriverWait mbbsaboard = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions actionMbbs = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		actionMbbs.moveToElement(more).perform();
		Thread.sleep(2000);
		WebDriverWait sectionNews = new WebDriverWait(driver, Duration.ofSeconds(4));
		sectionNews.until(ExpectedConditions.visibilityOfElementLocated(clickMbbsAbroad));
		driver.findElement(clickMbbsAbroad).click();
		Thread.sleep(4000);
		mbbsaboard.until(ExpectedConditions.visibilityOfElementLocated(mbbs));
		driver.navigate().back();
		System.out.println("NewsAndBlog page Navigate Properly");
	}
	
	//partnership
	public void patnership() throws InterruptedException {
		WebDriverWait portPartnership = new WebDriverWait(driver, Duration.ofSeconds(25));
		Actions actionPartner = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		actionPartner.moveToElement(more).perform();
		Thread.sleep(2000);
		
		WebDriverWait waitpartner=new WebDriverWait(driver,Duration.ofSeconds(4));
		waitpartner.until(ExpectedConditions.visibilityOfElementLocated(clickPartnership));
		
		driver.findElement(clickPartnership).click();
		Thread.sleep(4000);
		portPartnership.until(ExpectedConditions.visibilityOfElementLocated(patner));
		driver.navigate().back();
		System.out.println("it navigating the patner page properly");
	}
	
	public void carrers() throws InterruptedException {
		WebDriverWait prtCarrers=new WebDriverWait(driver,Duration.ofSeconds(25));
		Actions actionCarrers = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		actionCarrers.moveToElement(more).perform();
		Thread.sleep(2000);
		
		WebDriverWait waitpartner=new WebDriverWait(driver,Duration.ofSeconds(4));
		waitpartner.until(ExpectedConditions.visibilityOfElementLocated(clickPartnership));
		driver.findElement(clickPartnership).click();
		Thread.sleep(4000);
		prtCarrers.until(ExpectedConditions.visibilityOfElementLocated(carrerloc));
		driver.navigate().back();
		System.out.println("carrers page navigate properly");
	}
	
	public void contactUs() throws InterruptedException {
		WebDriverWait prtContactus=new WebDriverWait(driver,Duration.ofSeconds(25));
		Actions actionCarrers = new Actions(driver);
		WebElement more = driver.findElement(clickMoreButton);
		actionCarrers.moveToElement(more).perform();
		Thread.sleep(2000);
		WebDriverWait waitpartner=new WebDriverWait(driver,Duration.ofSeconds(4));
		waitpartner.until(ExpectedConditions.visibilityOfElementLocated(clickContactUs));
		driver.findElement(clickContactUs).click();
		Thread.sleep(4000);
		prtContactus.until(ExpectedConditions.visibilityOfElementLocated(contactus));
		driver.findElement(name).sendKeys("test");
		driver.findElement(number).sendKeys("9337823862");
		driver.findElement(mail).sendKeys("test@gmail.com");
		
		WebElement conta=driver.findElement(driopdownvalue);
		
		Select sc=new Select(conta);
		sc.selectByContainsVisibleText(" Tech Support");
		driver.findElement(textarea).sendKeys("testing");
		driver.findElement(submitContactUS).click();
		System.out.println("contact form successfully submited");
	}
}
