 package practicedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Parameters(value="browser")

	@BeforeMethod
	public void multiplebrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\Selenium Drivers\\MicrosoftWebDriver.exe");
			driver= new EdgeDriver();
			driver.get("www.google.com");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
	

@Test
  public void search() {
	
  driver.findElement(By.id("lst-ib")).sendKeys("sbi balance enquiry");
  driver.findElement(By.name("btnK")).click();
  }

@AfterMethod
public void closingbrowser()
{
	driver.close();
}
}
