
//ChildWindowPopup

//basic script 

//write a script to close parent as well as child window without usinng quit (20-12-2022)



package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowPopUP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");	
		}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		for (String s : allwindow) {       //for each loop
			driver.switchTo().window(s);
			driver.close();
		}
		
		



	}

}
