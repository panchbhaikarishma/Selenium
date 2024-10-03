package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4_5
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	/*driver.get("https://facebook.com");
	driver.findElement(By.id("email")).sendKeys("panchbhaikarishma@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("7774820964");
	driver.findElement(By.name("login")).click();*/
	//driver.get("https://Amazon.com");
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	driver.get("https://www.youtube.com");
	driver.findElement(By.id("search")).sendKeys("grotechmind");
	driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	
	
}
}
