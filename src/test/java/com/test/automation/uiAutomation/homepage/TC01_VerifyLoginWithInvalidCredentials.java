package com.test.automation.uiAutomation.homepage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC01_VerifyLoginWithInvalidCredentials extends TestBase {
	
	public static final Logger log= Logger.getLogger(TC01_VerifyLoginWithInvalidCredentials.class.getName());
	
	HomePage home;
	
	@BeforeTest
	public void setUp() {
		init();
		
	}

	@Test	
	public void VerifyLoginWithInvalidCredentials() {
		log.info("---------Start Test-------");
			home = new HomePage(driver);
			home.LoginToApplication("123","456");
			Assert.assertEquals(home.getInvalidText(),"Invalid email address.");
		log.info("---------Finish Test-------");
	}
	
	@AfterClass
	public void endTest() {
		driver.close();
		
	}
}
