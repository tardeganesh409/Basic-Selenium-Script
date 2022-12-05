
//write a script to open UniverSity Application and check whether the LOgo is displayed
//or not and printed on console by using isDisplayed();

//05-12-2022

package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.humanities.mcmaster.ca/?gclid=EAIaIQobChMIncrLuqLi-wIVThwrCh3scgyLEAAYASAAEgIbOPD_BwE");
		boolean logo=driver.findElement(By.cssSelector("path[class='shield']")).isDisplayed();
		if (logo==true) {
			System.out.println("Logo is Displayed on Website");
			
		} else {
			System.out.print("Logo is not displayed on website");

		}
		driver.close();
		
	}
}