package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceboook_browser_open {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\DriverFileChrome\\chromedriver.exe");
		
		//key="webdriver.gecko.driver"
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//open session
		String url="https://www.facebook.com/";
		driver.get(url);
		
		//
		//Verify require title Exepected title 
		String expectedTitle="Facebook";
		
		
		//Actual title on webpage
		String actualTitle=driver.getTitle();   //using get method create string object
		
		System.out.println(actualTitle);    //print statement 
		
		if(actualTitle.contains(expectedTitle)) 
			System.out.println("test Case passed");
		
		else
			System.out.println("test case failed");
		
		
		//Verify url
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.equals(url))
			System.out.println("URL is matched");
		
		else
			System.out.println("URL does not match");
		
		
		
		//Close the session
		
		//it execute next statement after 10 second
		Thread.sleep(10000);
		
		//it close the browser immediately
		driver.close();

}
	}
