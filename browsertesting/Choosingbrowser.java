package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Choosingbrowser {
	WebDriver d;

	@Test

	@Parameters("browsers")
	void browser(String nameofthebrowser) {
		if (nameofthebrowser.equals("chrome")) {
			d = new ChromeDriver();
			 
		}
		if (nameofthebrowser.equals("firefox")) {
			d = new FirefoxDriver();
			
		}
		 d.get("https://www.google.in");
		  String title= d.getTitle();
		  d.manage().window().maximize();

	}
}