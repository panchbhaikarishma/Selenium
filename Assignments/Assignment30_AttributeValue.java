package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment30_AttributeValue
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazom.in");
	driver.manage().window().maximize();
List<WebElement> Li=driver.findElements(By.tagName("a"));	
int count=Li.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
WebElement e1=Li.get(i);
//String s1=e1.getText();
String s1=e1.getAttribute("href");
System.out.println(s1);
}
	
	
	
	
}


}
