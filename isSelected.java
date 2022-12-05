
//write a script to open actiTime application and Check whether the checkBox is enable or not using isSelected();

//05-12-2022

package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox=driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
		if (checkbox==true) {
			System.out.println("CheckBox is enable");
			
		} else {
			System.out.println("checkBox is Disable");

		}
		driver.close();


	}

}
