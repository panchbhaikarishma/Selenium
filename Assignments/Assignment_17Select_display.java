package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_17Select_display 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/karis/Documents/learninig.html");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("123"));
boolean b1=	e1.isDisplayed();
System.out.println(b1);
boolean b2=e1.isSelected();
System.out.println(b2);
if(b2==true)
{
	System.out.println("It is alreay selected");
}
else
{
	e1.click();
}
}
}
