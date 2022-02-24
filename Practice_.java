package Selenium;art

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_ {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\DriverFileChrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	String url="https://mail.google.com/mail/u/0/#inbox";
	driver.get(url);
	
	driver.manage().window().maximize();
	
	
	
	
	/*String expectedTitle="email";
	
	
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	
	if (actualTitle.contains(expectedTitle))
		System.out.println("test case passed ");
	
	else
		System.out.println("test case fail");
	*/
	
	//veryfy url
	String actualUrl =driver.getCurrentUrl();
	System.out.println(actualUrl);
	
	if(actualUrl.contentEquals(url))
     System.out.println("url is matched");
     
   else
	   System.out.println("url is not matched");
	
	///close session
	Thread.sleep(5000);
	driver .close();
	
	
	
	
	
	
}
}
