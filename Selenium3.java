//write a script to open the shaadi.com and printed on console

package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shaadi.com");
		String ref=driver.getTitle();
		System.out.println(ref);
		driver.close();
		
		

	}

}
