package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.VisibilityPage;
import Pages.checkboxesPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class Visibility {
	WebDriver driver;
	@Test
	public void Visibile() throws InterruptedException {
		//Thread.sleep(5000);
		VisibilityPage v1 =new VisibilityPage(driver);
		boolean Displayed =v1.UIVisibility().isDisplayed();
		Assert.assertTrue(Displayed);
		v1.notVisibile().click();
		Displayed =v1.UIVisibility().isDisplayed();
		Assert.assertFalse(Displayed);
	}@BeforeTest
	public   void Launch() {

		String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe";// 	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com/pages/create/?ref_type=registration_form");
		  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	

	}


@AfterTest
public   void close(){
	driver.quit();
}

}
