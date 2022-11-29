// write a script to getCurrentUrl of spotify.com and printed on the console
package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium4 {
	static {
        System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");

	}      //static block
	

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver(); //empty chorme browser open
	    driver.get("https://open.spotify.com/"); //to get title 
	    String title =driver.getCurrentUrl();
	    System.out.println(title);
	    Thread.sleep(2000);
	    driver.close();             //empty chrome browser close
		

	}

}
