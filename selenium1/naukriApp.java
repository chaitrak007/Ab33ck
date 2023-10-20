import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriApp {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		
		  d.get("https://www.naukri.com");
		  String title= d.getTitle();
		  d.manage().window().maximize();
		  //d.findElement(By.id("APjFqb")).sendKeys("india");
		  d.findElement(By.id("register_Layer")).sendKeys(Keys.RETURN);
		 // d.findElement(By.className("socialIcnImg")).sendKeys(Keys.RETURN);

	}

}
