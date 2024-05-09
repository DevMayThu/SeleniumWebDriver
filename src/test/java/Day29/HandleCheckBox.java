package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//1. Select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2. Select all Checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for( int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
//		for(WebElement checkbox:checkboxes)
//		{
//			checkbox.click();
//		}
		
		//3. select last 3 checkboxes
		//total no of checkboxes- how many checkboxes want to select = starting index
		//7-3 = 4
//		for(int i=4;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		//select first 3 checkboxes
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}
		
		//unselect checkboxes if they are selected
		for(WebElement checkbox: checkboxes)
		{
			if(checkbox.isSelected())
				checkbox.click();
		}
	}

}
