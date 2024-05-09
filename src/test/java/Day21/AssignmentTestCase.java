package Day21;

import org.openqa.selenium.edge.EdgeDriver;

/* 
 * Test case
 * -------
 * 1> Launch Browser(Edge)
 * 2> Open URL https://demo.opencart.com/
 * 3> Validate title should be "Your Store"
 * 4> close Browser
 */
public class AssignmentTestCase {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com");
		
		String title = driver.getTitle() ;
		if(title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.quit(); //cannot use driver.close() in edge browser

	}

}
