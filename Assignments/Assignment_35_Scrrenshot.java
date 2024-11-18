package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_35_Scrrenshot 
{
public static void main(String[] args) throws IOException 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	
	
	TakesScreenshot ts=driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\karis\\Desktop\\Screenshots\\"+new Assignment_35_Scrrenshot().getClass()+".png");
	FileHandler.copy(source, Destination);
}
}
