package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22_AutoSuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.Flipkart.in");
	driver.manage().window().maximize();
WebElement e1=	driver.findElement(By.name("q"));
e1.sendKeys("Mobile");
Thread.sleep(1000);
List<WebElement> li=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
int count =li.size();
System.out.println(count);
Thread.sleep(1000);
li.get(2).click();


}
}
