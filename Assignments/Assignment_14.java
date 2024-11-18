package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_14 
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.manage().window().maximize();
WebElement e1=	driver.findElement(By.linkText("CONTINUE TO LOGIN"));
e1.click();
WebElement e2=driver.findElement(By.id("username"));
e2.sendKeys("Panchbhaikarishma");
WebElement e3=driver.findElement(By.name("password"));
e3.sendKeys("Sukshma@0530");
WebElement e4=driver.findElement(By.id("loginCaptchaValue"));
e4.sendKeys("XASDTY");
e4.sendKeys(Keys.ENTER);
WebElement e5=driver.findElement(By.xpath("//input[@type='submit']"));
e4.click();

	
}
}
