
////write a script to open fb application type USERNAME AND PASSWORD MANUALLY and use

//clear (); 

//DATE-10-12-2022

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearFunction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

		

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(7000);
			driver.findElement(By.cssSelector("input[id='email']")).clear();
			Thread.sleep(7000);
			driver.findElement(By.cssSelector("input[type='password']")).clear();

		}

}

	


