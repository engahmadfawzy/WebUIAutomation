package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisibilityPage {
	WebDriver driver;
	public VisibilityPage (WebDriver driver){
		this.driver=driver;
	}

public WebElement UIVisibility ()
{
	return driver.findElement(By.id("loginbutton"));
	
}
public WebElement notVisibile ()
{
	return driver.findElement(By.cssSelector("i[id*='u_']"));
	                             
}

}