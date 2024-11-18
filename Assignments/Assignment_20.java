package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_20 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoes");
List <WebElement> e2=driver.findElement(By.xpath();
int count=e2.size();
System.out.println(count);
}
}
