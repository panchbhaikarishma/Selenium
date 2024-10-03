package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.partialLinkText("Customer"));
	e1.click();
}

}
