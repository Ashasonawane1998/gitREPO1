package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sir3_conponent {
	

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",  "C:\\DriverFileChrome\\chromedriver.exe");
		
		//key="webdriver.gecko.driver"
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//open session
		String url="https://vctcpune.com/selenium/practice.html";
		
		driver.get(url);
		
		//scrolling-
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//get the all radio button
		int count=1;
	
		List<WebElement>radioList=driver.findElements(By.tagName("label"));
		
		WebElement  button3=driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		int totalradioButtonNo=radioList.size();
		System.out.println(totalradioButtonNo);
		
		//for loop for list
		for (WebElement ele:radioList) {
			
			String name=ele.getText();
			System.out.println(name);
		
			if (name.equals("Radio3"))
				radioList.indexOf(2);
				
				
			
			
				
			
		}
			
		
		Thread.sleep(10000);
		
		driver.close();
		

	}



}
