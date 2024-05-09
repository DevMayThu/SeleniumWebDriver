package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//Normal alert with OK button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Thread.sleep(5000);
//		
//		Alert mylert = driver.switchTo().alert();
//		System.out.println(mylert.getText());
//		mylert.accept();
		
		// confirmation alert
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(5000);
//		
//		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		
		myalert.sendKeys("Welcome");
		myalert.accept();
	}

}
