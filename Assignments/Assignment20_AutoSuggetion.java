package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20_AutoSuggetion 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("banglore");
	Thread.sleep(1000);
	
	List <WebElement> li=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count=li.size();
	System.out.println(count);
	
	li.get(5).click();
	
}
}
