
//write a script to submit openSourceBilling Application 


//05-12-2022

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitmethod {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
			driver.findElement(By.cssSelector("button[class='col s4 btn waves-effect']")).submit();  //we can used submit or click();
			Thread.sleep(5000);
			driver.close();
	}

}
