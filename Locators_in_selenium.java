package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_in_selenium {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\DriverFileChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open session
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		
		//locate element
		
		WebElement UN=driver.findElement(By.name("email"));
		UN.sendKeys("");
		
		//WebElement button=driver.findElement(By.tagName("button"));
		//button.click();
		
		WebElement Pass=driver.findElement(By.id("pass"));
	    Pass.sendKeys("654534");
		
	    WebElement b=driver.findElement(By.tagName("button"));
		b.click();
		
		
		
		//Thread.sleep(10000);
		//driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
