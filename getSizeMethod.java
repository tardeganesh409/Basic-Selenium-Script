
//write a script to open LinkDln application and Check HEIGHT AND WIDTH of username TextField

//using getSixe()

//05-12-2022

package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		int Height=driver.findElement(By.xpath("(//input[@class='input__input'])[1]")).getSize().getHeight();
		System.out.println("The Username TextField Height is"+Height);
		int Width=driver.findElement(By.xpath("(//input[@class='input__input'])[1]")).getSize().getWidth();
		System.out.println("The Username TextField Width is"+Width);
        driver.close();
		

	}

}
