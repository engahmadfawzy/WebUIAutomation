//Assignment 1 (launch edge)
package openchrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assigment1 {
	
		public static void main(String[] args) {
			String Edgepath = System.getProperty("user.dir")+"\\Resources\\msedgedriver.exe";// 	
			System.setProperty("webdriver.edge.driver", Edgepath);
			WebDriver driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.get("https://www.google.com.eg/?as_qdr=all&gws_rd=ssl");
	        driver.close();

	}

}
