package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment15_hoverover 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow']"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(3000);
    WebElement e2 = driver.findElement(By.xpath("//a[@class='nav-link                                    nav-item'][2]"));                                 
    e2.click();
	

}
}
