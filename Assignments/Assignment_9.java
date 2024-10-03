package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_9 
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/karis/Documents/learninig.html");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
	e1.sendKeys("KarishmaPanchbhai");
	WebElement e2= driver.findElement(By.xpath("(/html/body/input)[2]"));
	e2.sendKeys("Type your friend name");
WebElement e3=	driver.findElement(By.xpath("(/html/body/input)[3]"));
e3.sendKeys("Sukshma@0530");

WebElement e4=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
e4.sendKeys("Karishma Panchbhai");
WebElement e5=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
e5.click();





	
	 
	
	
	
}
}
