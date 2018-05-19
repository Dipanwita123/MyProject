package practicedemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlemultiplewindow {

	public static void main(String arg[])
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.irctctourism.com/cgi-bin/dev1.dll/irctc/booking/tourPackages.jsp#");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Exotic Hill Railway']"));
		act.moveToElement(element).build().perform();
	Set<String> allwindow = driver.getWindowHandles();
	for(String currentwindow:allwindow)
	{
		if(currentwindow!= parentwindow)
		{
			driver.switchTo().window(currentwindow);
		}
	}
		
	}
}
