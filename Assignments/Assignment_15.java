package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_15 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://ww.facebook.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.linkText("Create new account"));
	e1.click();
	
}
}
