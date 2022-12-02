
//write a script to open flipkart application and search any mobile >[price]< and printed

//on console

//02-12-2022  //if we want price(depedent value) then we go for depedent & indepdent method

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndepedent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung mobile");
	    driver.findElement(By.cssSelector("svg[width='20']")).click();
	    String price=driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F23 5G (Copper Blush, 128 GB)']/../../../div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
	    System.out.println(price);
	    driver.close();
		

	}

}
