import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		  String title= d.getTitle();
		  d.manage().window().maximize();
		  d.findElement(By.id("email")).sendKeys("chaitrakulkarnis#45@gmail.com");
		  d.findElement(By.id("pass")).sendKeys("K@1234567");
		  d.findElement(By.name("login")).sendKeys(Keys.RETURN);


	}

}
