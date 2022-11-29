package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementLocators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("ganesh@123"); //to find web-element
		Thread.sleep(6000);
		driver.findElement(By.name("password")).sendKeys("pass@1223");
		Thread.sleep(6000);
		driver.close();

	}

}
