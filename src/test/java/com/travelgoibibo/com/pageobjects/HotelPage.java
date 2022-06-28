package com.travelgoibibo.com.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class HotelPage {

	
	public WebDriver ldriver;
	String checkinmonthyear="June 2022";
	String checkoutmonthyear="June 2022";
	String Checkindate = "5";
	String Checkoutdate = "6";
	String place = "Gulmarg";
	
	public HotelPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Hotels") 
	WebElement linkhotel;
	
	@FindBy(xpath = "//input[@name='CountryType']//parent::div//h4[text()='International']") 
	WebElement rbuttonIndia;
	
	@FindBy(xpath = "//input[@data-testid='home-autosuggest-input']") 
	WebElement textplace;
	
	@FindBy(xpath = "//div[text()='Check-in']//parent::div//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-9 SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-14 bjZxoj kSflmU']") 
	WebElement txtcheckin;
	
	@FindBy(xpath = "//span[@data-testid='currentCalendarMonthName']") 
	WebElement labelcalmonthyear;
	
	@FindBy(xpath = "//span[@data-testid='calendarRightArrowBtn']") 
	WebElement Iconcalnextarrow;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/section/div/div[1]/div[2]/div/ul[2]/li") 
	List<WebElement> btnalldates;
	
	@FindBy(xpath = "//input[@value='2 Adults | 0 Child | 1 Room ']")
	WebElement btnguestandrooms;
	
	@FindBy(xpath = "//span[text()='Adults']//following-sibling::div//span[1]") 
	WebElement Iconadultminus;
	
	@FindBy (xpath = "//button[text()='Done']")
	WebElement buttondone;
	
	@FindBy(xpath = "//button[text()='Search']") 
	WebElement buttonsearchhotel;
	
	@FindBy(xpath = "//div[@class='infinite-scroll-component ']//h4")
	List<WebElement> labellistofhotels;
	
	@FindBy(xpath = "//div[@class='infinite-scroll-component ']//h4")
	WebElement WElabellistofhotel;
	
	@FindBy(xpath = "//h1[@class='dwebCommonstyles__SectionHeaderSEO-sc-112ty3f-7 HotelName__HotelNameText-sc-1bfbuq5-0 btHAYi iOrRvR']")
	WebElement labelhotelname;
	
	@FindBy(xpath="//div[@class='HotelInfostyles__CenterDiv-sc-1k29ep1-0 bdWrPS']//h1")
	WebElement labelactualhotelname;
	
	
	
	public void hotel() {
		linkhotel.click();
	}

	public void countryindia() {
		rbuttonIndia.click();	
	}
	
	public void place() throws InterruptedException {
		textplace.sendKeys(place);
		Thread.sleep(5000);
		Actions acts = new Actions(ldriver);
		acts.sendKeys(Keys.DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void checkin() throws InterruptedException {
		txtcheckin.click();
		while (true) {
			String mntyr = labelcalmonthyear.getText();
			System.out.println(mntyr);
			if(mntyr.equals(checkinmonthyear))
			{
				break;
			}
			else {
				
				Iconcalnextarrow.click();
			}
			
		}
		List <WebElement> dates = btnalldates;
		for(WebElement ele:dates) {
			String date_text=ele.getText();
			System.out.println(date_text);
			if(date_text.equals(Checkindate))
			{
				
				ele.click();
				break;
			}
		}
	}
	
	public void checkout() throws InterruptedException {
			while (true) {
			String mnthyr = labelcalmonthyear.getText();
			System.out.println(mnthyr);
			if(mnthyr.equals(checkoutmonthyear))
			{
				break;
			}
			else {
				
				Iconcalnextarrow.click();
			}
			
		}
		List <WebElement> odates = btnalldates;
		for(WebElement elem:odates) {
			String odate_text=elem.getText();
			System.out.println(odate_text);
			if(odate_text.equals(Checkoutdate))
			{
				Thread.sleep(5000);
				elem.click();
				break;
			}
		}
	}
	
	public void adultminus() throws InterruptedException {
		btnguestandrooms.click();
		
		Iconadultminus.click();
		
		buttondone.click();
		
		}
	
	public void searchhotel() {
		buttonsearchhotel.click();
			
		}

	public void hoteltitles() {
		 try {
		        Object lastHeight = ((JavascriptExecutor) ldriver).executeScript("return document.body.scrollHeight");

		        while (true) {
		            ((JavascriptExecutor) ldriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		            Thread.sleep(5000);

		            Object newHeight = ((JavascriptExecutor) ldriver).executeScript("return document.body.scrollHeight");
		            if (newHeight.equals(lastHeight)) {
		                break;
		            }
		            lastHeight = newHeight;
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		
		Reporter.log("No. of hotels" + String.valueOf(labellistofhotels.size()+ '\n') );
		Reporter.log("Hotel Names");
		List <WebElement> LH = labellistofhotels;
		for( WebElement s:LH) {
			
			String lineSeparator = System.lineSeparator()
					;
			Reporter.log( s.getText() + lineSeparator );
	}
	}
		
		public void hoteltitle() {
			 			
			
			Reporter.log("No. of hotels" + String.valueOf(labellistofhotels.size()+ '\n') );
			Reporter.log("Hotel Names");
			List <WebElement> LH = labellistofhotels;
			for( WebElement s:LH) {
				
				String lineSeparator = System.lineSeparator()
						;
				Reporter.log( s.getText() + lineSeparator );
		}
		
	}
	
public void verifyhoteltitle() throws InterruptedException {
		
		
		List <WebElement> LH = labellistofhotels;
			
		WebElement FirstHotel =  LH.get(0).findElement(By.xpath("//h4[@itemprop='name']"));
		String hotelName = FirstHotel.getText();

		Reporter.log("first"+hotelName);
		FirstHotel.click();
			
}
	
	public void verifyhoteltitles() throws InterruptedException {
		
		
		List <WebElement> LH = labellistofhotels;
			
		WebElement FirstHotel =  LH.get(0).findElement(By.xpath("//h4[@itemprop='name']"));
		String hotelName = FirstHotel.getText();

		Reporter.log("first"+hotelName);
		FirstHotel.click();
		
		ArrayList<String> newTab= new ArrayList<String> (ldriver.getWindowHandles());
		ldriver.switchTo().window(newTab.get(1));
		
		
		String ActualTitle =labelactualhotelname.getText();

		Reporter.log("actual:"+ActualTitle);
		
		if (ActualTitle.equals(hotelName)) {
			Reporter.log("Hotel name matches");
		}
		else
		{
			Reporter.log("Hotel name didnt match");
		}
		SoftAssert sat = new SoftAssert();
		sat.assertTrue(ActualTitle.equalsIgnoreCase(hotelName));
		sat.assertAll();
		
			
}
	
	}

