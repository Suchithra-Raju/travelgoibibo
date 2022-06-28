package com.travelgoibibo.com.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.travelgoibibo.com.pageobjects.HotelPage;

public class TC_LogHotelTitle_001 extends BaseClass {

		
	
	
	@Test
	public void searchhotel() throws AWTException, InterruptedException, IOException
	{
		
		// Open the URL- https://www.goibibo.com/
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				HotelPage ht = new HotelPage(driver);
				
		//Click on the “Hotels” menu
		ht.hotel();
		Logger.info("Hotel is passed");
		//Enter the location
		ht.countryindia();
		Logger.info("Countryindia is passed");
		Thread.sleep(5000);
		ht.place();
		Logger.info("place is passed");
		//Enter check-in and check-out details
		ht.checkin();
		Logger.info("checkin is passed");
		ht.checkout();
		Logger.info("checkout is passed");
		Thread.sleep(5000);
		//Select one adult under “Rooms” option
		ht.adultminus();
		Logger.info("adultminus is passed");
		//Click on the “Get Set Go” button
		Thread.sleep(3000);
		ht.searchhotel();
		Logger.info("searchhotel is passed");
		Thread.sleep(8000);
		//captureScreen(driver,"TC_LogHotelTitle_001");
		//Log hotel title and total count into TestNG
		ht.hoteltitles();
		Logger.info("hoteltitles is passed");
	}
	
	
	
	
	

}
