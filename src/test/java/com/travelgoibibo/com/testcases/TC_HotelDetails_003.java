package com.travelgoibibo.com.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.travelgoibibo.com.pageobjects.BookHotelPage;
import com.travelgoibibo.com.pageobjects.HotelPage;

public class TC_HotelDetails_003 extends BaseClass {
	
	@Test(priority=1)
	public void hoteldetails() throws AWTException, InterruptedException, IOException
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
				HotelPage ht = new HotelPage(driver);
				
		ht.hotel();
		Logger.info("Hotel is passed");
		ht.countryindia();
		Logger.info("Countryindia is passed");
		//Thread.sleep(5000);
		ht.place();
		//Search for a hotel in Ooty
		Logger.info("place is passed");
		ht.checkin();
		Logger.info("checkin is passed");
		ht.checkout();
		Logger.info("checkout is passed");
		//Thread.sleep(5000);
		ht.adultminus();
		Logger.info("adultminus is passed");
		Thread.sleep(3000);
		ht.searchhotel();
		Logger.info("searchhotel is passed");
		Thread.sleep(8000);
		ht.hoteltitle();
		Logger.info("searchhotel is passed");
		//Verify the hotel title and click on it
		ht.verifyhoteltitles();
		Logger.info("hoteltitles is passed");
	
	}
	@Test(priority =2)
	public void hotelreviews1() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		ArrayList<String> newTab= new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));//first child windows
		BookHotelPage ht2 = new BookHotelPage(driver);
		
		ht2.pgeroomoption();
		Logger.info("pgeroomoption is passed");
		//ht2.hotelroomimgage();
		captureScreen(driver,"TC_HotelDetails_003");
		Logger.info("hotelroomimgage is passed");
		ht2.guestreviews();
		Logger.info("guestreviews is passed");
		ht2.guestreviewandratinginpage();
		Logger.info("guestreviewandratinginpage is passed");
		ht2.hotelpolicies();
		Logger.info("hotelpolicies is passed");
		ht2.hotelpolciesinpage();
		Logger.info("hotelpolciesinpage is passed");
		ht2.location();
		Logger.info("location is passed");
		ht2.locationinpage();
		Logger.info("locationinpage is passed");
		ht2.qa();
		Logger.info("qa is passed");
		ht2.qainpage();
		Logger.info("qainpage is passed");
}
}
