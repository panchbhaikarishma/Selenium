package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment19__31
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("Skills"));
	Select s1=new Select(e1);
	s1.selectByValue("select1");
	WebElement e2=driver.findElement(By.id("Country"));
	Select s2=new Select(e2);
	s2.selectByVisibleText("India ");
	
	WebElement e3=driver.findElement(By.id("Relegion"));
	Select s3=new Select(e3);
	s3.selectByIndex(1);
	
	WebElement e4=driver.findElement(By.id("file"));
	e4.sendKeys("C:\\Users\\karis\\Downloads\\Abstract_class.pdf");

}
}
