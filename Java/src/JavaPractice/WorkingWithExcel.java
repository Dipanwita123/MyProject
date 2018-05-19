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

public class WorkingWithExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement button = driver.findElement(By.id("u_0_2"));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\dipanwita.saha\\Desktop\\facebook.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		String un = row.getCell(0).getStringCellValue();
		String pw = row.getCell(1).getStringCellValue();
		
		username.sendKeys(un);
		password.sendKeys(pw);
		button.click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
 FileOutputStream fos = new FileOutputStream("C:\\Users\\dipanwita.saha\\Desktop\\facebook.xlsx");
 Cell cell = row.createCell(2);
 String expresult = "Facebook";
 String actresult = driver.getTitle();
 if(expresult.equalsIgnoreCase(actresult))
 {
	 cell.setCellValue("passed");
 }
 else
 {
	 cell.setCellValue("failed");
 }
 wb.write(fos);
 
 robot.keyPress(KeyEvent.VK_ESCAPE);
	robot.keyRelease(KeyEvent.VK_ESCAPE);
 
 driver.findElement(By.id("userNavigationLabel")).click();
 Thread.sleep(600);
 driver.findElement(By.className("_54nh")).click();
 driver.close();
		

	}

}
