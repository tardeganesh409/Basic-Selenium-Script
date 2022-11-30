
//write a scrpit to open ebay application and search nokia mobile and display o/p

//30-11-2022
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBycontains {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pages.ebay.com/ebay-app-mobile/");
		Thread.sleep(6000);
		driver.findElement(By.id("gh-ac")).sendKeys("nokia");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//span[contains(.,'Nokia N Series N9-00 - 16GB - Black (Unlocked) Smartphone 3G GSM')]")).click();
		Thread.sleep(6000);
        driver.findElement(By.cssSelector("span[class='ux-call-to-action__text']")).click();
		


	}
	

}
