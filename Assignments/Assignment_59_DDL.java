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
import org.openqa.selenium.interactions.Actions;

public class Assignment_59_DDL 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	WebElement e2=driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]"));
	e2.click();
	WebElement e3=driver.findElement(By.name("email"));
	e3.sendKeys("7774820964"+Keys.ENTER);
	WebElement e4=driver.findElement(By.id("ap_password"));
	e4.sendKeys("Deepakchawan@3012"+Keys.ENTER);
	WebElement e5=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	Actions a2=new Actions(driver);
	a2.moveToElement(e5).perform();
	WebElement e6=driver.findElement(By.xpath("//span[.=\"Your Account\"]"));
	e6.click();
	WebElement e7=driver.findElement(By.xpath("//span[.=\"Edit addresses for orders and gifts\"]"));
	e7.click();
	WebElement e8=driver.findElement(By.xpath("//div[@class=\"a-box first-desktop-address-tile\"]"));
	e8.click();
	FileInputStream f1=new FileInputStream("C:\\Users\\karis\\eclipse-workspace\\Selenium_Start\\DataSheet\\SourceSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	Sheet s1= w1.getSheet("Login");
	Row r1=s1.getRow(6);
	Cell c1=r1.getCell(0);
	String name=c1.getStringCellValue();
	WebElement e9=driver.findElement(By.name("address-ui-widgets-enterAddressFullName"));
	e9.sendKeys(name);
	WebElement l1=driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber"));
	l1.sendKeys();
	WebElement l2=driver.findElement(By.name("name=\"address-ui-widgets-enterAddressPostalCode"));
	l2.sendKeys(args);
	
	
	
}

private static Row getRow(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
