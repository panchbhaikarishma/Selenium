package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813513%26hvpone%3D%26hvptwo%3D%26hvadid%3D713930225208%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1054323164097113921%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9181907%26hvtargid%3Dkwd-362216169274%26hydadcr%3D5620_2441742%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
WebElement e1=	driver.findElement(By.name("email"));
	e1.sendKeys("7774820964");
	WebElement e2=	driver.findElement(By.id("continue"));
	e2.click();
	WebElement e3=driver.findElement(By.name("password"));
	e3.sendKeys("Karishma@143");
	WebElement e4=driver.findElement(By.id("signInSubmit"));
	e4.click();
	
	driver.get("https://www.flipkart.com/account/login?ret=/");
	
	
	
}
}
