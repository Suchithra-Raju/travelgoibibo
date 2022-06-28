package com.travelgoibibo.com.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels-international/short-stay-group-residence-les-lilas-serviced-apartments-hotel-in-seine-saint-denis-8856934903102442197/?hquery=%7B%22ci%22:%2220220612%22,%22co%22:%2220220701%22,%22r%22:%221-1-0%22,%22ibp%22:%22v15%22%7D&hmd=b7edc3742b6e3849dcb67df079d1b19705dbc4e39d08d865e23e2bd12e3b6403418b18a47af66a6200b86b431a78d75ee24dbf96449e0d4f765e43640e8eda9c4727004ec9674df3529f56b788ca03265be5f541d51234a2991ab634f74ed507e275bf6086abc1d3636ee718ede26fdebebd80d01860603569fd09339ae6db5f4cac37b59974f532aedd22299cec3793e9b8be01e8bf55ea62a503c9d70fd96227f48360e533bcf372b09b3d32dd8d8390e8e0be695749f784cd316fada8c165496996fd2ee39aae1dfcf9112210d58e792a205f86aa98d0fec308d2337537633aef97dd3bde03f204e24a218c782bf24c25ff1aec12e47353130d7022120565db2e0a1d9bebac775439432a2a02a88eb105329b2429998f56d64f47b4a46d1dc446addb89c5a8fd0059bdc0c01f24123e1317d8ca7e254c9d2ed5e25c56e2c5f47856e8b72a941258ab8ec482ed83b15f93ff7053e79bf84309b0faac5f682e402eccb36a5b8eab29c96041fb704dc8ca6afc87ec86e578a6029b504d2daf4978529caaece0&cc=FR&vcid=1729246020357328248");
		Thread.sleep(3000);
		/**driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.xpath("//input[@name='CountryType']//parent::div//h4[text()='India']")).click();
		//driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys("ooty");
		
		WebElement place = driver.findElement(By.xpath("//input[@data-testid='home-autosuggest-input']"));
		//Action choose =builder.moveToElement(ele).click().sendKeys(location).sendKeys(Keys.ARROW_DOWN).click(ele).build()
		 place.sendKeys("oot");
		 place.sendKeys(Keys.ARROW_DOWN);
				
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 		 /*
		Actions act = new Actions(driver);
		Action seriesOfActions =
		act.moveToElement(place).click().sendKeys("Ooty").sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
		 Thread.sleep(2000);
		 seriesOfActions.perform();
*/
		
		/*List<WebElement> options = driver.findElements(By.xpath("//*[@role='listbox']"));
		for(WebElement ele:options) {
			String currentcity1=ele.getText();
			System.out.println(currentcity1);
			if(currentcity1.contains(optiontoselect)) {
				ele.click();
				break;
			}
		}*/
		//WebElement drp = driver.findElement(By.xpath("//*[@role='listbox']"));
		//Select dropdown = new Select(drp);
		//System.out.println("No of option"+ dropdown.getOptions().size());
		
		
		/*driver.findElement(By.xpath("//div[text()='Check-in']//parent::div//h4[@class=\"dwebCommonstyles__SmallSectionHeader-sc-112ty3f-9 SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-14 bjZxoj kSflmU\"]")).click();
		
		
		String monthyear="June 2022";
		String Checkindate = "12";
		String Checkoutdate = "20";
		SelectFutureDate(Checkindate,monthyear,Checkoutdate);
	
	}
	
	static void SelectFutureDate(String cid, String my, String cod)
	{

		Calendar cal=Calendar.getInstance();
		
		int currentmonth=cal.get(Calendar.MONTH)+1; // return the current date in int format
		
		for(int i=currentmonth;i>=1;i++)
		{
			driver.findElement(By.xpath("//span[@data-testid=\"calendarRightArrowBtn\"]")).click();//Next arrow
			String mon=driver.findElement(By.xpath("//span[@data-testid=\"currentCalendarMonthName\"]")).getText();
			System.out.println(mon);
			if(mon.equals(my))
			{
				driver.findElement(By.xpath("//span[text()="+cid+"]")).click();
				driver.findElement(By.xpath("//span[text()="+cod+"]")).click();
				break;
			}
		
		}

		//driver.findElement(By.xpath("//span[text()='Adults']//following-sibling::div//span[1]")).click();
		//driver.findElement(By.xpath("//button[text()='Done']")).click();
		
	}  */

}
}
