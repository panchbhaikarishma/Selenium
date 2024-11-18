package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_58_DDL 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	FileInputStream f1=new FileInputStream("C:\\Users\\karis\\eclipse-workspace\\Selenium_Start\\DataSheet\\SourceSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1=w1.getSheet("Login");
	Row r1=s1.getRow(4);
	Cell c1=r1.getCell(0);
	String object=c1.getStringCellValue();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys(object+Keys.ENTER);
	
}
}
