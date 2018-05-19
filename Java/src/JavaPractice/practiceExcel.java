package JavaPractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\dipanwita.saha\\Desktop\\facebook.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 1; i < rowcount+1; i++)
		{
			Row row = sheet.getRow(i);
			if(row.isFormatted())
			{
			for (int j = 0; j < row.getLastCellNum(); j++)
			{
				
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement button = driver.findElement(By.id("u_0_2"));
		
		String un = row.getCell(j).getStringCellValue();
		String pw = row.getCell(j+1).getStringCellValue();
		username.sendKeys(un);
		password.sendKeys(pw);
		button.click();
		
		 Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);	
		
 FileOutputStream fos = new FileOutputStream("C:\\Users\\dipanwita.saha\\Desktop\\facebook.xlsx");
 Cell cell = row.createCell(2);
WebElement expresult = driver.findElement(By.id("u_0_a"));

 if(expresult.isDisplayed())
 {
	 cell.setCellValue("passed");
	 driver.findElement(By.id("userNavigationLabel")).click();
	 Thread.sleep(600);
	 driver.findElement(By.className("_54nh")).click();
	 driver.close();
 }
 else
 {
	 cell.setCellValue("failed");
	 driver.close();
 }
 wb.write(fos);

		
		}

		}

	}

	}
}
