
//write a script to login of ActiTime application by X-path attribute
//39-11-2022

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin29 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		

	}

}
