package Testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.checkboxesPage;
import Pages.windowspage;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class Windows {
	WebDriver driver;
	@Test
	public void checkmarkNum() throws InterruptedException {
		windowspage w1=new windowspage(driver);
		w1.Multiwindow().click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		ArrayList<String> Tabs =new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Tabs.get(1));
		Thread.sleep(3000);
	}@BeforeTest
	public   void Launch() {

		String chromepath = System.getProperty("user.dir")+"\\Drivers\\chromedriver_1.exe";// 	
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.navigate().to("https://the-internet.herokuapp.com/windows");
	

	}


@AfterTest
public   void close(){
	driver.quit();
}

}
