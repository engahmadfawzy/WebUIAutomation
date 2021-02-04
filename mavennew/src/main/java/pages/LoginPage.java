package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
