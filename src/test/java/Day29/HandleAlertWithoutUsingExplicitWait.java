package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertWithoutUsingExplicitWait {

	//handle alert without using switch
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//Normal alert with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(5000);
		
		//Alert mylert = driver.switchTo().alert();
		Alert mylert = mywait.until(ExpectedConditions.alertIsPresent()); //capture alert
		
		System.out.println(mylert.getText());
		mylert.accept();
	}

}
