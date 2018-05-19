package JavaPractice;


import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Genericclass {
public static void capture(WebDriver driver, String screenshot)
{
	try
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("C:\\Users\\dipanwita.saha\\Desktop\\Screenshot" + screenshot + ".jpg"));
	}

catch(Exception e)
	{
	System.out.println("Exception"+ e.getMessage());
	}
}
 
public static class Excelfile{
	static String testdata; 
	public static String readexcel(String Filepath, int sheetnum, int rownum, int cellnum) throws Exception
	{
			FileInputStream Fis = new FileInputStream(Filepath);
			Workbook wb = WorkbookFactory.create(Fis);
			Sheet sheet = wb.getSheetAt(sheetnum);
			Row row = sheet.getRow(rownum);
			testdata = row.getCell(cellnum).getStringCellValue();
			wb.close();
	return testdata;	
	}
	 
	
}

}

