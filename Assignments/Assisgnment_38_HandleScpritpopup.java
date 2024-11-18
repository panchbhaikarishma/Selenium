package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assisgnment_38_HandleScpritpopup 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("fname"));
			e1.sendKeys("Karishma"+Keys.ENTER);
	WebElement e2=	driver.findElement(By.id("lname"));
			e2.sendKeys("Panchbhai"+Keys.ENTER);
	WebElement e3=driver.findElement(By.id("email"));
	e3.sendKeys("panchbhaikarishma05@gmail.com"+Keys.ENTER);
	WebElement e4=driver.findElement(By.id("password"));
	e4.sendKeys("Sukshma@0530"+Keys.DOWN);
	WebElement e5=driver.findElement(By.xpath("//input[@id='Female']"));
	e5.click();
	WebElement e6=driver.findElement(By.id("Skills"));
	Select s1=new Select(e6);
	s1.selectByValue("select1");
	WebElement e7=driver.findElement(By.id("Country"));
	Select s2=new Select(e7);
	s2.selectByValue("India");
	WebElement e8=driver.findElement(By.id("Present-Address"));
	e8.sendKeys("prabuddha nagar, wardha");
	WebElement e9=driver.findElement(By.id("Permanent-Address"));
	e9.sendKeys("prabuddha nagar, wardha");
	WebElement i1=driver.findElement(By.name("Pincode"));
	i1.sendKeys("441152");
	WebElement i2=driver.findElement(By.id("Relegion"));
	Select s3=new Select(i2);
	s3.selectByValue("Hindu");
	WebElement i3=driver.findElement(By.id("file"));
	i3.sendKeys("C:\\Users\\karis\\Downloads\\Pallavi Pantawane Resume.pdf");
	WebElement i4=driver.findElement(By.id("relocate"));
	i4.click();
	WebElement i5=driver.findElement(By.name("Submit"));
	i5.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
			
	
}
}
