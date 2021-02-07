package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class NewTest {
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
	}@BeforeTest
	public   void Launch() {

		String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe";// 	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.navigate().to("https://the-internet.herokuapp.com/login");
	

	}


@AfterTest
public   void close(){
	driver.quit();
}

}
