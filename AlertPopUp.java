
//alert popup Syntax  - Alert a=driver.switchTo().alert 
//                       a.accept();
//                       a.text();
//                       a.dismiss();

//Charactertics=[1] we cannot move this popup
//              [2] we cannot inspect this popup
//              [3]this popup has OK and CANCEL button
//this popup wii be displayed below address bar and middle in web Pages


package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("manu");
		driver.findElement(By.cssSelector("div[class='greyButton cancelBtn']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(7000);

		a.accept();
		 
		//a.dissmiss();
		
	   // String text = a.getText();
	   // System.out.println(text);
	    driver.close();
		
	}

}
