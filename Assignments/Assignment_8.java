package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 
{
public static void main(String[] args) 
{
	ChromeDriver diver=new ChromeDriver();
	diver.get("https://www.facebook.com");
	String Title=diver.getTitle();
		System.out.println(Title);
			//diver.close();
		System.out.println(diver.getWindowHandle());
	System.out.println(diver.getWindowHandles());

}
}
