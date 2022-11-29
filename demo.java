package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.cars24.com/");  //to open any link we used get()
	    driver.navigate(); //we can refresh the page ,backward & forward
	    
	    driver.close();   //to close the website 
	    driver.quit();    //to close all website browser
	    
	    
	    
	    
	    

	    
				   

		
		
	}
   

}
