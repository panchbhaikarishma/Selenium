package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_32 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("register_Layer"));
	e1.click();
WebElement e2=	driver.findElement(By.xpath("//span[.='Google']"));
e2.click();
Set<String>s1=driver.getWindowHandles();
Iterator<String> i1=s1.iterator();
String parentid=i1.next();
String childid=i1.next();
driver.switchTo().window(childid);
Thread.sleep(1000);
driver.close();


	
	
}
}
