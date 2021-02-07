package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.checkboxesPage;
import Pages.dropdownpae;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class dropdown {
	WebDriver driver;
	@Test
	public void dropdown() throws InterruptedException {
		dropdownpae d1 =new dropdownpae(driver);
		d1.dropdownlist().click();
		boolean e=d1.dropdownlist().isEnabled();
		Assert.assertTrue(e);
		boolean d=d1.dropdownlist0().isEnabled();
		Assert.assertFalse(d);
		
		
	}@BeforeTest
	public   void Launch() {

		String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe";// 	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
	

	}


@AfterTest
public   void close(){
	driver.quit();
}

}
