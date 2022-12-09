
//wrtie a script to get X-axis and Y-axis of searchText Box present in flipkart app

//06-12-2022

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		int xaxis=driver.findElement(By.cssSelector("input[type='text']")).getLocation().getX();
		int yaxis=driver.findElement(By.cssSelector("input[type='text']")).getLocation().getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
		driver.close();

	}

}
