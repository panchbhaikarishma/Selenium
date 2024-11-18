package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_37_CurrentTime 
{
public static void main(String[] args) throws IOException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.in");
 driver.manage().window().maximize();
 
 Date d1=new Date();
 System.out.println(d1.getTime());
 String s1=d1.toString();
 System.out.println(s1);
 String s2=s1.replaceAll(":","");
 System.out.println(s2);
 
 TakesScreenshot ts=driver;
 File source=ts.getScreenshotAs(OutputType.FILE);
 File destination=new File("C:\\Users\\karis\\Desktop\\Screenshots\\"+s2+".png");
 FileHandler.copy(source, destination);
 
}
}
