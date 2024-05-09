package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		//declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='UserName']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtuserpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtuserpassword.sendKeys("admin123");
		
		WebElement loginbtn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login'")));
		loginbtn.click();
		
		
	}

}
