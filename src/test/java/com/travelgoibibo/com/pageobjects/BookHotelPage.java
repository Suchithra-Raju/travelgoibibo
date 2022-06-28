package com.travelgoibibo.com.pageobjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BookHotelPage {
	
	public WebDriver ldriver;
	String firstname ="xyz";
	String lastname = "cver";
	String gmail = "abc@gmail.com";
	String pan ="ABCDE7895K";
	String mobile = "8759865214";
	
	public BookHotelPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	
	@FindBy(xpath ="//span[text()=' ROOM OPTION']")
	WebElement btnroomoptions;
	
	@FindBy(xpath="//button[@data-testid='selectRoomBtn']") 
	WebElement btnselectroom;
	
	@FindBy(xpath ="//input[@placeholder='Enter First Name']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Last Name']")
	WebElement txtLastname;
	
	@FindBy (xpath ="//input[@placeholder='Enter Email Address']")
	WebElement txtEmail;
	
	@FindBy (xpath = "//input[@placeholder='Enter Phone Number']")
	WebElement txtPhoneno;
	
	@FindBy (xpath ="//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-12 GuestDetailsBlockstyles__CustomButton-sc-1rzm4ar-6 QWIoF blGWwt']")
	WebElement btnproceedopayment;
	
	@FindBy (xpath ="//input[@class='inputPan']")
	WebElement txtenterpan;
	
	@FindBy (xpath ="//div[@id='errorText']")
	WebElement lableinvalidpan;
		
	@FindBy(xpath = "//span[text()='Pay At Hotel Available']")
	WebElement chckbxpayathotel;
	
	@FindBy(xpath = "//span[text()='Upto ₹2000']")
	WebElement chckbxupto2000;
	
	@FindBy(xpath ="//div[@class='CheckBoxList__CheckboxListWrapperDiv-sc-5k7440-0 cwdPLu']//span[text()='4']")
	WebElement chckboxcustomerrating4;
	
	@FindBy(xpath ="//div[text()='No property found for your search criteria. Please reset filters.']")
	WebElement labelNoPropfoundmessage;
	
	@FindBy (xpath="//a[text()='Room Options']")
	WebElement linkpgeRoomoptions;
	
	
	@FindBy (xpath ="//div[@class='Roomstyles__RoomTypeStyledWrapper-sc-1ivl7fs-2 fwlUPM']//img")
	WebElement imghotelrooms;
	
	@FindBy(xpath = "//a[text()='Guest Reviews']")
	WebElement linkpgeguestreviews;
	
	@FindBy(xpath ="//h3[contains(text(),'Guest Reviews & Rating')]")
	WebElement labelguestreviewrating;
	
	@FindBy(xpath = "//a[text()='Hotel Policies']")
	WebElement linkpgehotelpolicies;
	
	@FindBy(xpath="//div[contains(text(),'Hotel Policies')]")
	WebElement labelhotelpolicies;
	
	@FindBy(xpath = "//a[text()='Location']")
	WebElement linkpgelocation;
	
	@FindBy(xpath ="//h3[contains(text(),'Location')]")
	WebElement labellocation;
	
	@FindBy(xpath = "//a[text()='Questions & Answers']")
	WebElement linkpgeQA;
	
	@FindBy (xpath="//span[contains(text(),'Question & Answer')]")
	WebElement lableQA;
	
	
		
	public void roomoption() {
		btnroomoptions.click();
		}
	
	public void selectroom() {
		btnselectroom.click();
	}
	
	public void Firstname() {
		txtFirstname.sendKeys(firstname);
	
	}
	
	public void Lastname() {
		txtLastname.sendKeys(lastname);
	}
	
	public void Email() {
		txtEmail.sendKeys(gmail);
	}
	
	public void phone() {
		txtPhoneno.sendKeys(mobile);
	}
	
	public void proccedpayment() {
		btnproceedopayment.click();
	}
	
	public void enterpan() {
		txtenterpan.sendKeys(pan);
	}
	
	public void invalidpan() {
		String errortext = lableinvalidpan.getText();
		Reporter.log(errortext);
	
	}
	
	public void filterpayathotel() {
		chckbxpayathotel.click();
	}
	
	public void filterupto2000() {
		chckbxupto2000.click();
	}
	
	public void filtercustomerrating4() {
		chckboxcustomerrating4.click();
	}
	
	public void filternopropfoundmessage() {
		
		String message = labelNoPropfoundmessage.getText();
		Reporter.log(message);
	}
	
	public void pgeroomoption() {
		linkpgeRoomoptions.click();
	}
	
	/**public void hotelroomimgage() {
		
		String image = imghotelrooms.getText();
		Reporter.log(image);
	}**/
	
	public void guestreviews() {
		
		try {
			linkpgeguestreviews.click();
		}catch (NoSuchElementException ex) {
			Reporter.log("Element is not dispalyed");
		}
		
		
	}
	
	public void guestreviewandratinginpage() {
		
		boolean ele = labelguestreviewrating.isDisplayed();
		String s1=String.valueOf(ele);  
		Reporter.log(s1);
		Reporter.log("guest review page is displayed");
	}
	public void hotelpolicies() {
		linkpgehotelpolicies.click();
	}
	
	
	
	public void hotelpolciesinpage() {
		
		boolean ele1 = labelhotelpolicies.isDisplayed();
		String s2=String.valueOf(ele1);  
		Reporter.log(s2);
		Reporter.log("hotel policies page is displayed");
	}
	
	
	public void location() {
		linkpgelocation.click();
		
	}
	
	public void locationinpage() {
		
		boolean ele2 = labellocation.isDisplayed();
		String s3=String.valueOf(ele2);  
		Reporter.log(s3);
		Reporter.log("location page is displayed");
	}
	
	
	
	public void qa() {
		linkpgeQA.click();
	}
	
	
	public void qainpage() {
			boolean ele3 = lableQA.isDisplayed();
			String s4=String.valueOf(ele3);  
			Reporter.log(s4);
			Reporter.log("QA page is displayed");
		}
			
	}
	
