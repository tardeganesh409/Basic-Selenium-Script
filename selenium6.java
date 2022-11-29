//write a script to used manage() and perform minimize and maximize in the same script
//(10-11-2022)

package qsp;



import org.openqa.selenium.chrome.ChromeDriver;

public class selenium6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(4000);
	    //maximize
		driver.manage().window().maximize();
		driver.get("https://www.coingecko.com/");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.close();
	}
}

