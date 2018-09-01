package javaFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserC {

	public static void main(String[] args) {
		
		//Setting system properties
		System.setProperty("webdriver.chrome.driver", "C:\\utilities\\Selenium\\java\\resources\\chromedriver_win32\\chromedriver.exe");
		
		//Initialising webdriver
		WebDriver browser=new ChromeDriver();
		
		
		//navigating to website
		browser.get("http://team-bhp.com");
		
		//closing the browser
		browser.close();
		

	}

}
