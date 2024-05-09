package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
		   
		   WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
				     }
				   });
		   
		   txtUsername.sendKeys("Admin");
		  

	}

}
