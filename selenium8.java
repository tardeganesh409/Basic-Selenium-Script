//write a scipt to entre username textfield of actitime application 
//link (demo.actitime.com/) date=[11-11-2022]
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
        driver.findElement(By.id("cookie-consent")).click();//findElement is used to find the web element which is presend on web Page
        Thread.sleep(6000);
        driver.close();
		
		
}
}

