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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_57_DDT 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("//span[.='Sign in']"));
		e2.click();
		FileInputStream f1=new FileInputStream("C:\\Users\\karis\\eclipse-workspace\\Selenium_Start\\DataSheet\\SourceSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("Login");
		Row r1=s1.getRow(1);
	Cell c1=	r1.getCell(0);
	String un=c1.getStringCellValue();
	Row r2=s1.getRow(1);
	Cell c2=r2.getCell(1);
	String password=c2.getStringCellValue();
	WebElement e3=driver.findElement(By.name("email"));
	e3.sendKeys(un);
	WebElement e4=driver.findElement(By.id("continue"));
	e4.click();
WebElement e5=	driver.findElement(By.name("password"));
e5.sendKeys(password);
WebElement e6=driver.findElement(By.id("signInSubmit"));
e6.click();
	
	
	
		
	
}
}
