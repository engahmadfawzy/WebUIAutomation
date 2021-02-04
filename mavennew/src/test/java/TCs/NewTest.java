package TCs;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class NewTest extends TestBase {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		LoginPage P1 =new LoginPage(driver);
		P1.	SelenuimElement().getText();
		String URL=P1.SelenuimElement().getAttribute("href");
		Assert.assertEquals(URL, "http://elementalselenium.com/");
		P1.	loginBtn().click();
		Thread.sleep(2000);
		String cssvalue=P1.Flash().getCssValue("background-color");
		Assert.assertEquals(cssvalue, "rgba(198, 15, 19, 1)");
		System.out.println(cssvalue);
	}
}
