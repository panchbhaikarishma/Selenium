package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_42_Scrolling 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:www.youtube.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//input[@id='search']"));
	e1.sendKeys("India");
	e1.sendKeys(Keys.ENTER);
int i=10;
while(i>9)
{
	Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	
JavascriptExecutor js=driver;
	js.executeScript("window.scrollBy(0,"+y+")");
	y++;
	
	
}
	
}
}
