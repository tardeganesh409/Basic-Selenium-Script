//24-11-2022
//tagName 

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromDriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pooja%20tarade/Desktop/demo.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(6000);
		driver.quit();

	}

}
