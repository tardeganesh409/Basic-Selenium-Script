//write a script to getpagesource of the cricbuzz.com and printed on the console

package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5 {
	static {
        System.setProperty("webdriver.chrome.driver", "./driver/chromeDriver.exe");

	}      //static block
	

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); //empty chorme browser open
	    driver.get("https://www.cricbuzz.com/"); //to get title 
	    String title =driver.getPageSource();
	    System.out.println(title);
	    //thread.sleep(2000) =       for timing
	    driver.close();             //empty chrome browser close
		

	}

}
