//write a script to click on dream11 link and come backward and again click on cricbuzz
//link present in demo.html page (24-11-2022)

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pooja%20tarade/Desktop/demo.html");
		driver.findElement(By.linkText("Dream11 Fantasy")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dhoni Mania ")).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
