
//write a script to open insta application and verify that login button is enable or not
//using isEnabled();

//05-12-2022

package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		boolean button=driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]")).isEnabled();
		if (button==true) {
			System.out.println("Button is enable");
			
		} else {
			System.out.println("Button is not enable");

		}
		driver.close();


	}

}
