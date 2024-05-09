package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag-id.. tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");
		
		//#id - unique
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
		
		//tag class -- tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input.plac");)
		
		
		
		

	}

}
