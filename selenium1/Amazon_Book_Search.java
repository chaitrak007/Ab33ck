import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Book_Search {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		 d.get("https://www.amazon.in");
		  String title= d.getTitle();
		  d.manage().window().maximize();
	      d.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		  d.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		  d.findElement(By.partialLinkText("Psychopathology")).click();

	}

}
