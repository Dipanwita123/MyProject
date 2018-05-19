package JavaPractice;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice2demo {



	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement place = driver.findElement(By.xpath("//input[@id =\"hp-widget__sfrom\" ]"));
		Select sel = new Select(place);
		LinkedList<WebElement> placelist = (LinkedList<WebElement>) sel.getOptions();
		for (int i = 0; i< placelist.size(); i++)
		{
//			String place2 = placelist.get(i).getText();
			WebDriverWait wait = new WebDriverWait(driver,100);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Mumbai, India ")));
			if (i==1)
			{
				sel.selectByIndex(i);
			}
		}

	}

}
