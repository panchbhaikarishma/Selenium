package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.in");
	WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
	e1.sendKeys("shoes");
	e1.sendKeys(Keys.ENTER);
	
}
}
