//date 11-11-2022
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pooja%20tarade/Desktop/demo.html");
		driver.findElement(By.id("pushpa")).click();
		driver.close();
		
		
		
		
		
		

	}

}
