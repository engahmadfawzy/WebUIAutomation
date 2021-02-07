package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.checkboxesPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class checkBox {
	WebDriver driver;
	@Test
	public void checkmarkNum() throws InterruptedException {
		checkboxesPage c1=new checkboxesPage(driver);
		boolean checkmark;
//		checkmark= c1.checkbox().isSelected();
//		Assert.assertFalse(checkmark);
//		c1.checkbox().click();
//		 checkmark= c1.checkbox().isSelected();
//		Assert.assertTrue(checkmark);
//		boolean checkmark2= c1.checkbox2().isSelected();
//		Assert.assertTrue(checkmark2);
		c1.checkboxNum("1").click();
		checkmark =c1.checkboxNum("1").isSelected();
		Assert.assertTrue(checkmark);
		c1.checkboxNum("2").click();
		Assert.assertTrue(checkmark);
		
		
		
	}@BeforeTest
	public   void Launch() {

		String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe";// 	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	

	}


@AfterTest
public   void close(){
	driver.quit();
}

}
