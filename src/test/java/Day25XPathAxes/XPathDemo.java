package Day25XPathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self - selects the current node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/self::a")).getText();
		System.out.println("Self:  "+ text); //Wipro
		
		//Parent - selects the parent of the current node(always one)
		text = driver.findElement(By.xpath("//a[contains(text(),'Wipro')]/parent::td")).getText();
		System.out.println("Parent: " + text);
		
		//Child - selects all children of the current node(one or many)
		List <WebElement> childs = (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'Wipro')]/ancestor::tr/td"));
		
		System.out.println("Number of child elements: " + childs.size()); // 5
	}

}
