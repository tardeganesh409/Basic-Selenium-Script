package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver.chromeDriver.exe");
	}

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://open.spotify.com/");
		String ref=driver.getTitle();
		System.out.println(ref);
		driver.close();

	}

}
