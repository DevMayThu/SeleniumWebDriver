package Day26WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//get(url) - open the url ont he browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle() - title of the webpage
		System.out.println(driver.getTitle()); //orangeHRM
		
		//getCurrentUrl() - return URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getpagesource()- return source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle - reutrn ID of the single browser window
		String windowid = driver.getWindowHandle();
		System.out.println("Window ID : " + windowid);
		
		//getwindowhandles() - return ID's of the multiple browser windows
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		
//		Set<String>  windowids = driver.getWindowHandles();
//		System.out.println(windowids);
	}
	
	

}
