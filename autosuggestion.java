package demo1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

////write a script to open & search nokia get all the auto-suggestions present in amazon application

//08-12-2022


import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("nokia");
		
		List<WebElement>allsuggestion=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count=allsuggestion.size();
		
		for (int i = 0; i < count; i++) {
			String Text=allsuggestion.get(i).getText();
			System.out.println(Text);
			
			
		}
		driver.close();
		

	}

}
