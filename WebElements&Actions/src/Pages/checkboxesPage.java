package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkboxesPage {
	WebDriver driver;
	public checkboxesPage (WebDriver driver){
		this.driver=driver;
	}
//public WebElement checkbox ()
//{
//	return driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
//	
//}
//public WebElement checkbox2 ()
//{
//	return driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
//	
//}
public WebElement checkboxNum (String Num)
{
	return driver.findElement(By.xpath("//input[@type='checkbox']["+Num+"]"));
	
}

}