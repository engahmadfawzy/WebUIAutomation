package openchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import googlepages.SearchingPage;
import googlepages.SignInPage;
import googlepages.homepage;

public class Assignment3
{
	  WebDriver driver;
	  @BeforeTest
	public   void Launch() {

	String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";// 	
	System.setProperty("webdriver.chrome.driver", chromepath);
 	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.google.com.eg");
    driver.findElement(By.linkText("English")).click();//Select English lang.

}
	  @Test (priority=1)
	public   void Login_with_Invalid_Email() throws InterruptedException
	{
		homepage home =  new homepage();
		home.SignInBtn(driver).click();
		
		SignInPage email =new SignInPage();
		email.EmailField(driver).sendKeys("asw");
		email.NextBtn(driver).click();
		Thread.sleep(3000);
		String Actual_Result;
		Actual_Result =email.error_msg(driver).getText();
		System.out.println(Actual_Result);
		Reporter.log(Actual_Result);
		System.out.println(Actual_Result.contains("Couldn’t"));
		
	}
	  @Test (priority=2)
	public   void Verify_Forgot_email() throws InterruptedException
	{
		SignInPage forgot =new SignInPage();
		forgot.Forgot_email(driver).click();
		String Actual_Result;
		Actual_Result =driver.getCurrentUrl();
		System.out.println(Actual_Result);
		System.out.println(Actual_Result.contains("signin/v/usernamerecovery"));
		
	}
	  @Test (priority=3, dependsOnMethods = {"Verify_Forgot_email"})
	public   void SearchGoogle() throws InterruptedException
	{
		driver.navigate().to("https://www.google.com.eg");
		homepage search =new homepage();
		search.SearchResults(driver).sendKeys("Selenuim");
		search.SearchResults(driver).sendKeys(Keys.ENTER);
		SearchingPage ResultsCalculations =new SearchingPage();
		
		
		String Actual_Result;
		Actual_Result =ResultsCalculations.Results(driver).getText();
		System.out.println(Actual_Result);
		System.out.println(Actual_Result.contains("43,600,000"));
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ResultsCalculations.Results(driver).getText().contains("43,600,000"),true);
		ResultsCalculations.Results(driver).getText();
		System.out.println(2+3);
		//Assert.assertEquals(actual, expected);
	/*	try{
			soft.assertAll(); 	
		}catch (Error e)
		{
			System.out.println(e.getMessage());
		}*/
	}
		@AfterMethod
		public void GOTO_HomePage(ITestResult result)
		{
			//driver.navigate().to("https://www.google.com.eg");
			if (result.isSuccess()== true )
{
				System.out.println("Passed");
			}
			else if (result.isSuccess()== false )
{
				System.out.println("Failed");
			}
		}
	
	@AfterTest
	public   void close(){
		driver.quit();
	}
	
}