package LibraryFiles;
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
	//@Author Name: Sanjay
	//This method is use to get Test data from excel sheet
	//need to pass 2 inputs 1:rowIndex  2:colIndex 
	public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\24thJune.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();		
		return value;
	}
	
	
	public static void captureSS(WebDriver driver, int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\FailedTCesSS\\TestCaseID" +TCID+ ".jpg");
		FileHandler.copy(src, dest);
	}
	
	
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);	
		
		return value;		
	}
	
	
	
	
}
