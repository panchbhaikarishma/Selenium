package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_39_Script_pop 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/javascript-popup/");
	driver.manage().window().maximize();
	
WebElement e1=	driver.findElement(By.xpath("//button[@class=\"btnjs\"]"));
e1.click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
WebElement e2=driver.findElement(By.xpath("//a[.='Login']"));
e2.click();



	
}
}
