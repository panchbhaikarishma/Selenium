package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_16 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/karis/Documents/learninig.html");
	driver.switchTo().alert().accept();
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("121"));
boolean b1=	e1.isDisplayed();
System.out.println(b1);
boolean b2=e1.isEnabled();
System.out.println(b2);
if(b1 && b2)
{
	e1.click();
}
else
{
	System.out.println("Cant perform Action");
}
	
	
}
}
