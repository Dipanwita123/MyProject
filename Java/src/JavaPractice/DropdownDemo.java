package JavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {


	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:/Selenium Drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
Select sel = new Select(month);
//sel.selectByIndex(2);
//sel.selectByValue("Feb");
//sel.selectByVisibleText("Feb");
List<WebElement> monthlist = sel.getOptions();
System.out.println(monthlist.get(9).getText());
for (int i = 0; i< monthlist.size(); i++)
{
	String monthItem = monthlist.get(i).getText();
	if(monthItem.equals("Sept"))
	{

		sel.selectByVisibleText(monthItem);

		
	}
}
driver.close();
	}

}
