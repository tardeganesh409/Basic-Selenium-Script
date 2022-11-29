//write a script to navigate flipkart app and enter shoes in searchBox 
//25-11-2022
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartApp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromdriver");

	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"));
		driver.close();
		

	}

}
