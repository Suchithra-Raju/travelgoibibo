package com.travelgoibibo.com.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.travelgoibibo.com.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseurl = readconfig.getApplicationURL();
	public static WebDriver driver;
	
	public static Logger Logger;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		Logger=org.apache.log4j.Logger.getLogger("travelgoibibo.com");
		PropertyConfigurator.configure("log4j.properties");
		
	if(br.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver = new ChromeDriver();
	}
	if(br.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		 driver = new FirefoxDriver();
	}
	if(br.equals("ie")) {
		 System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
		 driver = new ChromeDriver();
	}
  
	
	
	}

	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
		FileUtils.copyFile(source,target);
		Reporter.log("screenshot taken");
	}
}
