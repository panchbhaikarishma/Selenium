package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_12 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/karis/Documents/learninig.html");
	WebElement e1=driver.findElement(By.tagName("a"));
	e1.click();
}
}
