//write the xpath for for entering username in fb application by using Xpath By attribute
//28-11-2022

//Q2)write the xpath for entering hotel name in swiggy app by using Xpath by attribute

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tardeganesh26@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass@415514");
        driver.findElement(By.xpath("//button [@name='login']")).click();  
        
	}
}
		
		
	

	


