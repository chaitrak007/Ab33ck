import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_absolute {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		  d.get("https://www.google.com");
		  String title= d.getTitle();
		  d.manage().window().maximize();
		  WebElement searchbar= d.findElement(By.xpath("(/html/body/div/div[3]/form/div/div/div/div/div[2]/textarea)"));
		  searchbar.sendKeys("india");
		
		
	}

}
