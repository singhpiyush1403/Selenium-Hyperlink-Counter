import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinksInOnWebPage {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	List<WebElement> linkElements = driver.findElements(By.tagName("div"));
	
	System.out.println("Total Available link on Webpage:"+ linkElements.size());
	for(WebElement el: linkElements) {
		System.out.println(el.getText());
		
	}
	
	driver.close();

	}

}
