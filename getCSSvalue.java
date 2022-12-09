
//write a script css value of tanishk value logo and printed on console

//06-12-2022
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSvalue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tanishq.co.in/shop/gold?sort=10&utm_source=HM_Google&utm_medium=cps&utm_campaign=HM_Search_Brand_Performance_AllIntent_Exact_Sep22&utm_term=Core&&cm_mmc=Google-_-Jhumki-_-Search-_-Nov&gclid=EAIaIQobChMIyZyBlazk-wIVEplmAh10ogDDEAAYASAAEgKJ0vD_BwE");
		String value=driver.findElement(By.cssSelector("img[width='80px']")).getCssValue("color");
	    System.out.println(value);
	    driver.close();
	}
}
