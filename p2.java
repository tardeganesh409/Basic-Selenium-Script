package qsp;


import org.openqa.selenium.chrome.ChromeDriver;

public class p2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver(); // empty chromeBrowser
        driver.get("https://www.tesla.com/");
        String ref=driver.getCurrentUrl();
        System.out.println(ref);
        Thread.sleep(3000); 
        driver.close();
	}
        
	

}
