package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTD(int rowindex,int collindex) throws EncryptedDocumentException, IOException
	{
		Sheet sh; 
		FileInputStream file=new FileInputStream("C:\\Users\\Arnav\\eclipse-workspace\\IB\\TestData\\newdata.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowindex).getCell(collindex).getStringCellValue();
		return value;
	}
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Arnav\\eclipse-workspace\\IB\\property.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Arnav\\eclipse-workspace\\Flipkart_maven_project\\FailedTestCaseSS\\TestCase"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
}
