
//write a script to naviagte to actitimme application and go for manufacturing type of 
//work and get the rate of manuafcturing present in actiTime application

//03-12-2022
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTypeWork {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.actitime.com/login.do");
		   driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//div[.='Login ']")).click();
		   driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		   Thread.sleep(4000);
	 	   driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		   String price=driver.findElement(By.xpath("//a[.='manufacturing']/../../td[4]/span[1]")).getText();
		   System.out.println(price);
		   Thread.sleep(5000);
		   driver.close();
	}
}
		

	
       
       
     
       
       
       
       
       
       
       
	
	
