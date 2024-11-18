package Assignments;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_43_headless 
{
public static void main(String[] args) 
{
	ChromeOptions c1=new ChromeOptions();
	c1.addArguments("--headless");
	
	ChromeDriver driver = new ChromeDriver(c1);
	driver.get("https://www.Amazon.in");
 driver.manage().window().maximize();
}
}
