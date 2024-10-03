package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 
{
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	//driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIm43Tu7vviAMV28U8Ah3FgyAsEAAYASAAEgKJK_D_BwE_k_");
	WebElement e1=driver.findElement(By.linkText("Mobiles"));
	e1.click();
	
}
}
