//Assignment 2(check forgot email)

package openchrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {

	public static void main(String[] args) {
		
	
			String chromepath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";// 	
			System.setProperty("webdriver.chrome.driver", chromepath);
			WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com.eg");
            driver.findElement(By.linkText("English")).click();//Select English lang.
            driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/ServiceLogin']")).click();//sign in
            driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']")).click();//Forgot email
            String ActualResult=driver.getCurrentUrl();
            String ExpectedResut="/signin/v2/fogotemail";
            System.out.println(ActualResult.contains(ExpectedResut));
           driver.quit();
	}

} 
