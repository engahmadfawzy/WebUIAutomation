package googlepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchingPage {

	public WebElement Results(WebDriver driver) 
	{
		return driver.findElement(By.cssSelector("div[id='result-stats']"));//Results calculations
	}
	
}
