import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Image {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		  d.get("https://www.google.in");
		  String title= d.getTitle();
		  d.manage().window().maximize();
		  d.findElement(By.linkText("Images")).click();
		  d.findElement(By.id("APjFqb")).sendKeys("india");
		  d.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);


	}

}
