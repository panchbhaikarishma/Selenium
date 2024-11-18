package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment34
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Dress"+Keys.ENTER);
	WebElement e2=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
	e2.click();
	Set<String>s1=driver.getWindowHandles();
	Iterator<String> l1=s1.iterator();
	String parentid=l1.next();
	String childid=l1.next();
	driver.switchTo().window(childid);
	Thread.sleep(1000);
	WebElement e3= driver.findElement(By.id("wishListMainButton"));
	e3.click();
	
	
	
}
}
