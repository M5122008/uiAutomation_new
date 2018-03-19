package com.test.automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	
public static final Logger log= Logger.getLogger(TestBase.class.getName());


public WebDriver driver;
String browser="firefox";
String BaseUrl="http://automationpractice.com/index.php";

public void init() {
	getBrowser(browser);
	getUrl(BaseUrl);
	String log4jConfPath="log4j.properties";
	PropertyConfigurator.configure(log4jConfPath);
}

public void getBrowser(String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
		log.info("creating object of:"+browser);
		driver=new FirefoxDriver();
	}
}

public void getUrl(String BaseUrl) {
	log.info("Navigating to URL"+BaseUrl);
	driver.get(BaseUrl);
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}




}
