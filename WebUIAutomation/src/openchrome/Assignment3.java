package openchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import googlepages.SearchingPage;
import googlepages.SignInPage;
import googlepages.homepage;

public class Assignment3
{
	static WebDriver driver;
	public static void Launch() {

	String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";// 	
	System.setProperty("webdriver.chrome.driver", chromepath);
 	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.google.com.eg");
    driver.findElement(By.linkText("English")).click();//Select English lang.

}
	public static void Login_with_Invalid_Email() throws InterruptedException
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
		System.out.println(Actual_Result.contains("Couldn’t"));
		
	}
	public static void Verify_Forgot_email() throws InterruptedException
	{
		SignInPage forgot =new SignInPage();
		forgot.Forgot_email(driver).click();
		String Actual_Result;
		Actual_Result =driver.getCurrentUrl();
		System.out.println(Actual_Result);
		System.out.println(Actual_Result.contains("signin/v2/usernamerecovery"));
		
	}
	public static void SearchGoogle() throws InterruptedException
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
		
	}
	public static void main(String[] args) throws InterruptedException{
		Launch();
		Login_with_Invalid_Email();
		Verify_Forgot_email();
		SearchGoogle();
		driver.close();
		
	}
	
}