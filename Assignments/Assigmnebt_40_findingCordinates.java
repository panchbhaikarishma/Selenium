package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnebt_40_findingCordinates 
{
public static void main(String[] args)
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:www.Amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//a[.='About Amazon']"));
	Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	
}
}
