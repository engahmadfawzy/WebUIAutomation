package googlepages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class homepage {

		public WebElement SignInBtn(WebDriver driver) 
		{
		System.out.println("SignIN");
		return driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/ServiceLogin']"));//sign in

		}
		public WebElement SearchResults(WebDriver driver) 
		{
		System.out.println("SignIN");
		return driver.findElement(By.name("q"));//sign in

		}
	}


