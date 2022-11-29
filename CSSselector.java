
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromdriver");

	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window();
		driver.get("file:///C:/Users/Pooja%20tarade/Desktop/demo.html");
		driver.findElement(By.cssSelector("a[id='pushpa']"));
		driver.close();
		

	}

}
