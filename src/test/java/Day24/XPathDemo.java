package Day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		//Xpath with single attribue
		
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@name='Search'][@placeholder='Search']")).sendKeys("Apple");
		
		//xpath with and Operator
		
//		driver.findElement(By.xpath("//input[@name='Search' and @placeholder ='Search']")).sendKeys("Tshirts");
		
		//xpath inner text
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		boolean displaystatus = driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value = driver.findElement(By.xpath("//h3[normalize-space()='Featured']")).getText();
		System.out.println(value);
		
		//xpath with contains
		//Search
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		
		
	}

}
