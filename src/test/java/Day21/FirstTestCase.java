package Day21;

import org.openqa.selenium.chrome.ChromeDriver;

/* 
 * Test case
 * -------
 * 1> Launch Browser(Chrome)
 * 2> Open URL https://demo.opencart.com/
 * 3> Validate title should be "Your Store"
 * 4> close Browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		//driver.quit();
		

	}

}
