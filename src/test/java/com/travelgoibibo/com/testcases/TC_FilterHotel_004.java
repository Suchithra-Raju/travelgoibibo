package com.travelgoibibo.com.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.travelgoibibo.com.pageobjects.BookHotelPage;
import com.travelgoibibo.com.pageobjects.HotelPage;

public class TC_FilterHotel_004 extends BaseClass{
	
	@Test(priority=1)
	public void filterhotel() throws AWTException, InterruptedException, IOException
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
		ht.place();
		Logger.info("place is passed");
		ht.checkin();
		Logger.info("checkin is passed");
		ht.checkout();
		Logger.info("checkout is passed");
		ht.adultminus();
		Logger.info("adultminus is passed");
		ht.searchhotel();
		Thread.sleep(3000);
		Logger.info("searchhotel is passed");
		Thread.sleep(8000);
		ht.hoteltitle();
		Logger.info("hoteltitles is passed");
	
	}
	@Test(priority=2)
public void filterhotel1() throws InterruptedException {
		
		Thread.sleep(2000);
		BookHotelPage ht1 = new BookHotelPage(driver);
		ht1.filterpayathotel();
		Logger.info("filterpayathotel is passed");
		Thread.sleep(2000);
		ht1.filterupto2000();
		Logger.info("filterupto2000 is passed");
		Thread.sleep(2000);
		ht1.filtercustomerrating4();
		Logger.info("filtercustomerrating4 is passed");
		Thread.sleep(2000);
		ht1.filternopropfoundmessage();
		Logger.info("filternopropfoundmessage is passed");
		

}
}
