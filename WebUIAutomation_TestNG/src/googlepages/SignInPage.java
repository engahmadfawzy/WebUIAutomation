package googlepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	public WebElement EmailField(WebDriver driver) 
	{
	return driver.findElement(By.name("identifier"));//Email Field

	}
	public WebElement NextBtn(WebDriver driver) 
	{
	return driver.findElement(By.cssSelector("div[class='VfPpkd-RLmnJb']"));//Next Button

	}
	public WebElement error_msg(WebDriver driver) 
	{
	return driver.findElement(By.cssSelector("div[class='o6cuMc']"));//Next Button

	}
	public WebElement Forgot_email(WebDriver driver) 
	{
	return driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']"));//Forgot email

	}
}
