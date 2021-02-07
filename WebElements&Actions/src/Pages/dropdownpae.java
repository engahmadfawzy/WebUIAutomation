package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dropdownpae {
	WebDriver driver;
	public dropdownpae (WebDriver driver){
		this.driver=driver;
	}

public WebElement dropdownlist ()
{
	return driver.findElement(By.xpath("//option[@value='1']"));
	
}
public WebElement dropdownlist0 ()
{
	return driver.findElement(By.xpath("//option[text()='Please select an option']"));
	
}

}