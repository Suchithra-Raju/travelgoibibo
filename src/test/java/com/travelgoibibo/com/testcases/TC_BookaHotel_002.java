package com.travelgoibibo.com.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.travelgoibibo.com.pageobjects.BookHotelPage;
import com.travelgoibibo.com.pageobjects.HotelPage;

public class TC_BookaHotel_002 extends BaseClass {
	
	@Test(priority=1)
	public void bookhotel() throws AWTException, InterruptedException, IOException
	{
		//Open the URL - https://www.goibibo.com
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
				HotelPage ht = new HotelPage(driver);
		//Click on the “Hotels” Menu	
		ht.hotel();
		Logger.info("Hotel is passed");
		// Enter the location
		ht.countryindia();
		Logger.info("Countryindia is passed");
		ht.place();
		Logger.info("place is passed");
		// Enter check-in and check-out details
		ht.checkin();
		Logger.info("checkin is passed");
		ht.checkout();
		Logger.info("checkout is passed");
		//Select one adult under “Rooms” option
		//ht.adultminus();
		//Logger.info("adultminus is passed");
		//Log hotel name and hotel search count
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
	public void bookhotel1() throws InterruptedException {
		
		Thread.sleep(2000);
		ArrayList<String> newTab= new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(newTab.get(1));//first child windows
		
		BookHotelPage ht1 = new BookHotelPage(driver);
		Thread.sleep(3000);
		 //Go ahead and click on the “Book Now” button
		ht1.roomoption();
		Logger.info("roomoption is passed");
		ht1.selectroom();
	    // click on the Pay button
		Logger.info("selectroom is passed");
		Thread.sleep(3000);
		ht1.Firstname();
		//Enter credit card details
		Logger.info("Firstname is passed");
		ht1.Lastname();
		Logger.info("Lastname is passed");
		ht1.Email();
		Logger.info("Email is passed");
		ht1.phone();
		Logger.info("phone is passed");
		//Thread.sleep(3000);
		ht1.proccedpayment();
		Logger.info("proceedpayment is passed");
		//Thread.sleep(3000);
		//website got changed
		//ht1.enterpan();
		//Logger.info("enterpan is passed");
		//Thread.sleep(3000);
		//website got changed
		//ht1.invalidpan();
		//Logger.info("invalidpan is passed");
	}

}
