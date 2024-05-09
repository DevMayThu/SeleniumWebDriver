package Day26WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		//get(url) - open the url ont he browser
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		///is displayed() - we can check display status of the element
		WebElement logos = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo:" + logos.isDisplayed());
		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status of logo:" + status);
		
				
		//isEnabled() - we can check enable/disable status of the element/operational element
		status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("Enable Status: "+ status);
		
		//isSelected - we can use to check the radio button, checkbox
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("After selecting female...");
		female_rd.click();
		
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Newsletter checkedbox Status: " + newsletterstatus);
	}

}
