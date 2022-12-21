
//write a script to handle frames

//21-12-2022

package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); //synchronziation
		driver.get("file:///C:/Users/Pooja%20tarade/Desktop/Page1.html");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("G");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("T");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("A");
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    

		driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("A");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		

	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("N");
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("R");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("E");
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("D");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("S");
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    
	    
	    driver.findElement(By.xpath("//input[@id='tb2']")).sendKeys("E");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("H");
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	}
}
	    
	    
	    
		
		


	


