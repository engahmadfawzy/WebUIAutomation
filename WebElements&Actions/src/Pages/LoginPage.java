package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage (WebDriver driver){
		this.driver=driver;
	}
public WebElement SelenuimElement ()
{
	return driver.findElement(By.xpath("//a[@target='_blank']"));
}
public WebElement Flash ()
{
	return driver.findElement(By.id("flash"));
}
public WebElement loginBtn ()
{
	return driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
}
}
